package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Iterator;
import java.util.List;
import p204p.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private List<Object> _unresolvedIds;

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<Object> it = this._unresolvedIds.iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
        sb.append('.');
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public synchronized UnresolvedForwardReference fillInStackTrace() {
        return this;
    }
}
