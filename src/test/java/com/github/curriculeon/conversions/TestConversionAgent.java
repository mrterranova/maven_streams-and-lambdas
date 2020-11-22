package com.github.curriculeon.conversions;

import com.github.curriculeon.anthropoid.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Ignore
/**
 * Created by leon on 5/25/17.
 * @ATTENTION_TO_STUDENTS You are FORBIDDEN from modifying this class
 */
public interface TestConversionAgent<T extends PersonConversionAgent<Person>> {

    default Person[] getPersonArray() {
        return getConversionAgent().toArray();
    }

    default Stream<Person> getPersonStream() {
        return getConversionAgent().toStream();
    }

    T getConversionAgent();


    default List<Person> getPersonList() {
        return getConversionAgent().toList();
    }


    @Test
    default void testCount() {
        int listSize = getPersonList().size();
        int arrayLength = getPersonArray().length;
        int streamCount = (int) getPersonStream().count();

        Assert.assertEquals(listSize, arrayLength);
        Assert.assertEquals(listSize, streamCount);
    }

    @Test
    default void testToList() {
        for (int i = 0; i < getPersonList().size(); i++) {
            long listId = getPersonList().get(i).getPersonalId();
            long arrayId = getPersonArray()[i].getPersonalId();

            Assert.assertEquals(listId, arrayId);
        }
    }


    @Test
    default void testToStream() {
        List<Person> people = getPersonStream().collect(Collectors.toList());

        for (int i = 0; i < people.size(); i++) {
            long arrayId = getPersonArray()[i].getPersonalId();
            long streamId = people.get(i).getPersonalId();

            Assert.assertEquals(streamId, arrayId);
        }
    }

    @Test
    default void testToArray() {
        for (int i = 0; i < getPersonArray().length; i++) {
            long arrayId = getPersonArray()[i].getPersonalId();
            long listId = getPersonList().get(i).getPersonalId();

            Assert.assertEquals(listId, arrayId);
        }
    }
}
