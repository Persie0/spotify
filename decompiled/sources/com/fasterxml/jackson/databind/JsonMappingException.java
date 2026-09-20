package com.fasterxml.jackson.databind;

import java.util.Iterator;
import java.util.LinkedList;
import p204p.ikc0;

/* JADX INFO: loaded from: classes3.dex */
public class JsonMappingException extends DatabindException {
    protected LinkedList<Object> _path;

    public void _appendPathDesc(StringBuilder sb) {
        LinkedList<Object> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Object> it = linkedList.iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
    }

    public String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(')');
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
