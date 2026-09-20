package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Character> {
    static final NumberDeserializers$CharacterDeserializer primitiveInstance = new NumberDeserializers$CharacterDeserializer(Character.TYPE, 0);
    static final NumberDeserializers$CharacterDeserializer wrapperInstance = new NumberDeserializers$CharacterDeserializer(Character.class, null);

    public NumberDeserializers$CharacterDeserializer(Class<Character> cls, Character ch) {
        super(cls, LogicalType.Integer, ch, (char) 0);
    }
}
