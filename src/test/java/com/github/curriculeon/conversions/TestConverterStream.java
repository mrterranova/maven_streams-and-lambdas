package com.github.curriculeon.conversions;

import com.github.curriculeon.TestConstants;
import com.github.curriculeon.anthropoid.Person;
import org.junit.Ignore;

import java.util.stream.Stream;

/**
 * Created by leon on 5/25/17.
 * @ATTENTION_TO_STUDENTS You are FORBIDDEN from modifying this class
 */
@Ignore
public class TestConverterStream implements TestConversionAgent, TestConstants {

    @Override
    public PersonConversionAgent<Stream<Person>> getConversionAgent() {
        return new StreamConverter(collectionSize);
    }
}