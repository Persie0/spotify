package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes3.dex */
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();

    public StringDeserializer() {
        super(String.class);
    }
}
