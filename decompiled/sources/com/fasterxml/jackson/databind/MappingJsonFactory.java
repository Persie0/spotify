package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;

/* JADX INFO: loaded from: classes3.dex */
public class MappingJsonFactory extends JsonFactory {
    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }
}
