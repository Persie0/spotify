package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes3.dex */
public class UntypedObjectDeserializer extends StdDeserializer<Object> {
    protected static final Object[] NO_OBJECTS = new Object[0];
    protected JavaType _listType;
    protected JavaType _mapType;
    protected final boolean _nonMerging;

    public static class Vanilla extends StdDeserializer<Object> {
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        public Vanilla(boolean z) {
            super(Object.class);
            this._nonMerging = z;
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this(null, null);
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super(Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }
}
