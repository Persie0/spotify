package com.fasterxml.jackson.annotation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class JsonSetter$Value implements Serializable {
    protected static final JsonSetter$Value EMPTY;
    private final Nulls _contentNulls;
    private final Nulls _nulls;

    static {
        Nulls nulls = Nulls.DEFAULT;
        EMPTY = new JsonSetter$Value(nulls, nulls);
    }

    public JsonSetter$Value(Nulls nulls, Nulls nulls2) {
        this._nulls = nulls;
        this._contentNulls = nulls2;
    }

    private static boolean _empty(Nulls nulls, Nulls nulls2) {
        Nulls nulls3 = Nulls.DEFAULT;
        return nulls == nulls3 && nulls2 == nulls3;
    }

    public static JsonSetter$Value empty() {
        return EMPTY;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            JsonSetter$Value jsonSetter$Value = (JsonSetter$Value) obj;
            if (jsonSetter$Value._nulls == this._nulls && jsonSetter$Value._contentNulls == this._contentNulls) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
    }

    public Object readResolve() {
        return _empty(this._nulls, this._contentNulls) ? EMPTY : this;
    }

    public String toString() {
        return "JsonSetter.Value(valueNulls=" + this._nulls + ",contentNulls=" + this._contentNulls + ")";
    }
}
