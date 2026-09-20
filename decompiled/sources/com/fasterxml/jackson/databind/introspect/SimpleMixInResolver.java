package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleMixInResolver implements ClassIntrospector.MixInResolver, Serializable {
    protected final ClassIntrospector.MixInResolver _overrides;

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }
}
