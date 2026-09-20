package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedClass extends Annotated {
    private static final Creators NO_CREATORS;
    protected final Class<?> _class;
    protected final JavaType _type = null;
    protected final List<JavaType> _superTypes = Collections.EMPTY_LIST;
    protected final Class<?> _primaryMixIn = null;
    protected final Annotations _classAnnotations = AnnotationCollector.emptyAnnotations();
    protected final TypeBindings _bindings = TypeBindings.emptyBindings();
    protected final AnnotationIntrospector _annotationIntrospector = null;
    protected final ClassIntrospector.MixInResolver _mixInResolver = null;
    protected final TypeFactory _typeFactory = null;
    protected final boolean _collectAnnotations = false;

    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<Object> creatorMethods;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<Object> list2) {
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        NO_CREATORS = new Creators(null, list, list);
    }

    public AnnotatedClass(Class<?> cls) {
        this._class = cls;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedClass.class) && ((AnnotatedClass) obj)._class == this._class;
    }

    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public String toString() {
        return "[AnnotedClass " + this._class.getName() + "]";
    }
}
