package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeBase extends JavaType implements JsonSerializable {
    private static final TypeBindings NO_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected final TypeBindings _bindings;
    volatile transient String _canonicalName;
    protected final JavaType _superClass;
    protected final JavaType[] _superInterfaces;

    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
        this._bindings = typeBindings == null ? NO_BINDINGS : typeBindings;
        this._superClass = javaType;
        this._superInterfaces = javaTypeArr;
    }

    public static StringBuilder _classSignature(Class<?> cls, StringBuilder sb, boolean z) {
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            if (z) {
                sb.append(';');
            }
            return sb;
        }
        if (cls == Boolean.TYPE) {
            sb.append('Z');
            return sb;
        }
        if (cls == Byte.TYPE) {
            sb.append('B');
            return sb;
        }
        if (cls == Short.TYPE) {
            sb.append('S');
            return sb;
        }
        if (cls == Character.TYPE) {
            sb.append('C');
            return sb;
        }
        if (cls == Integer.TYPE) {
            sb.append('I');
            return sb;
        }
        if (cls == Long.TYPE) {
            sb.append('J');
            return sb;
        }
        if (cls == Float.TYPE) {
            sb.append('F');
            return sb;
        }
        if (cls == Double.TYPE) {
            sb.append('D');
            return sb;
        }
        if (cls != Void.TYPE) {
            throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
        }
        sb.append('V');
        return sb;
    }

    public boolean _hasNTypeParameters(int i) {
        return this._class.getTypeParameters().length == i;
    }

    public abstract String buildCanonicalName();

    public JavaType containedType(int i) {
        return this._bindings.getBoundType(i);
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public String toCanonical() {
        String str = this._canonicalName;
        return str == null ? buildCanonicalName() : str;
    }
}
