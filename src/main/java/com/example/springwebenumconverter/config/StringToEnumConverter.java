package com.example.springwebenumconverter.config;

import com.example.springwebenumconverter.entity.Level;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, Level> {

    @Override
    public Level convert(String source) {
        return Level.valueOf(source.toUpperCase());
    }
}
