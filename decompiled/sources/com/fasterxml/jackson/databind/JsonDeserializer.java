package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.deser.NullValueProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonDeserializer<T> implements NullValueProvider {

    public static abstract class None extends JsonDeserializer<Object> {
        private None() {
        }
    }
}
