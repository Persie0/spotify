package com.fasterxml.jackson.annotation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class JsonInclude$Value implements Serializable {
    protected static final JsonInclude$Value EMPTY;
    protected final Class<?> _contentFilter;
    protected final JsonInclude$Include _contentInclusion;
    protected final Class<?> _valueFilter;
    protected final JsonInclude$Include _valueInclusion;

    static {
        JsonInclude$Include jsonInclude$Include = JsonInclude$Include.USE_DEFAULTS;
        EMPTY = new JsonInclude$Value(jsonInclude$Include, jsonInclude$Include, null, null);
    }

    public JsonInclude$Value(JsonInclude$Include jsonInclude$Include, JsonInclude$Include jsonInclude$Include2, Class<?> cls, Class<?> cls2) {
        this._valueInclusion = jsonInclude$Include == null ? JsonInclude$Include.USE_DEFAULTS : jsonInclude$Include;
        this._contentInclusion = jsonInclude$Include2 == null ? JsonInclude$Include.USE_DEFAULTS : jsonInclude$Include2;
        this._valueFilter = cls == Void.class ? null : cls;
        this._contentFilter = cls2 == Void.class ? null : cls2;
    }

    public static JsonInclude$Value empty() {
        return EMPTY;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        JsonInclude$Value jsonInclude$Value = (JsonInclude$Value) obj;
        return jsonInclude$Value._valueInclusion == this._valueInclusion && jsonInclude$Value._contentInclusion == this._contentInclusion && jsonInclude$Value._valueFilter == this._valueFilter && jsonInclude$Value._contentFilter == this._contentFilter;
    }

    public int hashCode() {
        return this._contentInclusion.hashCode() + (this._valueInclusion.hashCode() << 2);
    }

    public Object readResolve() {
        JsonInclude$Include jsonInclude$Include = this._valueInclusion;
        JsonInclude$Include jsonInclude$Include2 = JsonInclude$Include.USE_DEFAULTS;
        return (jsonInclude$Include == jsonInclude$Include2 && this._contentInclusion == jsonInclude$Include2 && this._valueFilter == null && this._contentFilter == null) ? EMPTY : this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this._valueInclusion);
        sb.append(",content=");
        sb.append(this._contentInclusion);
        if (this._valueFilter != null) {
            sb.append(",valueFilter=");
            sb.append(this._valueFilter.getName());
            sb.append(".class");
        }
        if (this._contentFilter != null) {
            sb.append(",contentFilter=");
            sb.append(this._contentFilter.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }
}
