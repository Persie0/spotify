package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContextAttributes {

    public static class Impl extends ContextAttributes implements Serializable {
        protected static final Impl EMPTY = new Impl(Collections.EMPTY_MAP);
        protected static final Object NULL_SURROGATE = new Object();
        protected transient Map<Object, Object> _nonShared = null;
        protected final Map<?, ?> _shared;

        public Impl(Map<?, ?> map) {
            this._shared = map;
        }

        public static ContextAttributes getEmpty() {
            return EMPTY;
        }
    }

    public static ContextAttributes getEmpty() {
        return Impl.getEmpty();
    }
}
