package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSettings implements Serializable {
    private static final TimeZone DEFAULT_TIMEZONE = DesugarTimeZone.getTimeZone("UTC");
    protected final AccessorNamingStrategy$Provider _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final ClassIntrospector _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final Base64Variant _defaultBase64;
    protected final Locale _locale;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final PolymorphicTypeValidator _typeValidator;

    public BaseSettings(ClassIntrospector classIntrospector, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy$Provider accessorNamingStrategy$Provider) {
        this._classIntrospector = classIntrospector;
        this._annotationIntrospector = annotationIntrospector;
        this._typeFactory = typeFactory;
        this._dateFormat = dateFormat;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
        this._typeValidator = polymorphicTypeValidator;
        this._accessorNaming = accessorNamingStrategy$Provider;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public BaseSettings withClassIntrospector(ClassIntrospector classIntrospector) {
        return this._classIntrospector == classIntrospector ? this : new BaseSettings(classIntrospector, this._annotationIntrospector, null, this._typeFactory, null, this._dateFormat, null, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }
}
