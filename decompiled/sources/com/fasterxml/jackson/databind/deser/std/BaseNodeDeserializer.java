package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super(cls);
        this._supportsUpdates = bool;
    }
}
