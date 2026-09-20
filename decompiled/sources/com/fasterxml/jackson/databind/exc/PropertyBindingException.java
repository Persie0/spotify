package com.fasterxml.jackson.databind.exc;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    protected transient String _propertiesAsString;
    protected final Collection<Object> _propertyIds;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String getMessageSuffix() {
        String str = this._propertiesAsString;
        if (str != null || this._propertyIds == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = this._propertyIds.size();
        if (size == 1) {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(this._propertyIds.iterator().next()));
            sb.append('\"');
        } else {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator<Object> it = this._propertyIds.iterator();
            while (it.hasNext()) {
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        sb.append("])");
        String string = sb.toString();
        this._propertiesAsString = string;
        return string;
    }
}
