package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.PropertyName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class RootNameLookup implements Serializable {
    protected transient LRUMap<Object, PropertyName> _rootNames = new LRUMap<>(20, 200);

    public Object readResolve() {
        return new RootNameLookup();
    }
}
