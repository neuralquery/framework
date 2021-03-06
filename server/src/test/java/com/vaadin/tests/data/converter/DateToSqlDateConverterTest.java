package com.vaadin.tests.data.converter;

import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import com.vaadin.data.util.converter.DateToSqlDateConverter;
import com.vaadin.data.util.converter.ValueContext;

public class DateToSqlDateConverterTest extends AbstractConverterTest {

    @Override
    protected DateToSqlDateConverter getConverter() {
        return new DateToSqlDateConverter();
    }

    @Test
    public void testValueConversion() {
        Date testDate = new Date(100, 0, 1);
        long time = testDate.getTime();
        assertValue(testDate, getConverter().convertToModel(
                new java.sql.Date(time), new ValueContext(Locale.ENGLISH)));
    }
}
