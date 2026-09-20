package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: as */
/* JADX WARN: Method from annotation default annotation not found: contentAs */
/* JADX WARN: Method from annotation default annotation not found: contentConverter */
/* JADX WARN: Method from annotation default annotation not found: contentUsing */
/* JADX WARN: Method from annotation default annotation not found: converter */
/* JADX WARN: Method from annotation default annotation not found: include */
/* JADX WARN: Method from annotation default annotation not found: keyAs */
/* JADX WARN: Method from annotation default annotation not found: keyUsing */
/* JADX WARN: Method from annotation default annotation not found: nullsUsing */
/* JADX WARN: Method from annotation default annotation not found: typing */
/* JADX WARN: Method from annotation default annotation not found: using */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }
}
