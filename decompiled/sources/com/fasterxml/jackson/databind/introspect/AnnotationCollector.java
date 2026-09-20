package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnnotationCollector {
    protected static final Annotations NO_ANNOTATIONS = new NoAnnotations();

    public static class NoAnnotations implements Annotations, Serializable {
    }

    public static Annotations emptyAnnotations() {
        return NO_ANNOTATIONS;
    }
}
