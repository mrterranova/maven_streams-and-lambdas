package com.github.curriculeon.conversions;

import com.github.curriculeon.TestConstants;
import com.github.curriculeon.anthropoid.Person;
import org.junit.Ignore;

/**
 * Created by leon on 5/25/17.
 * @ATTENTION_TO_STUDENTS You are FORBIDDEN from modifying this class
 */
@Ignore
public class TestConverterArray implements TestConversionAgent, TestConstants {

    @Override
    public PersonConversionAgent<Person[]> getConversionAgent() {
        return new ArrayConverter(collectionSize);
    }
}