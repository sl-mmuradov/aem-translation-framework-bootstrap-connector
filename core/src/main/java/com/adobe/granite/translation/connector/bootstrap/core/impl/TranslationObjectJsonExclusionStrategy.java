package com.adobe.granite.translation.connector.bootstrap.core.impl;

import com.google.common.collect.ImmutableSet;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import java.util.Set;

public class TranslationObjectJsonExclusionStrategy implements ExclusionStrategy
{
    private static final Set<String> EXCLUDED_FIELDS = ImmutableSet.of(
            "getTranslationObjectInputStream",
            "getTranslationObjectXMLInputStream",
            "getTranslationObjectJSONInputStream",
            "getTranslatedObjectInputStream"
    );

    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes)
    {
        return EXCLUDED_FIELDS.contains(fieldAttributes.getName());
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass)
    {
        return false;
    }
}
