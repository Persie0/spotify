package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultAccessorNamingStrategy$Provider extends AccessorNamingStrategy$Provider implements Serializable {
    protected final String _getterPrefix;
    protected final String _isGetterPrefix;
    protected final String _setterPrefix;
    protected final String _withPrefix;

    public DefaultAccessorNamingStrategy$Provider() {
        this("set", "with", "get", "is", null);
    }

    public DefaultAccessorNamingStrategy$Provider(String str, String str2, String str3, String str4, DefaultAccessorNamingStrategy$BaseNameValidator defaultAccessorNamingStrategy$BaseNameValidator) {
        this._setterPrefix = str;
        this._withPrefix = str2;
        this._getterPrefix = str3;
        this._isGetterPrefix = str4;
    }
}
