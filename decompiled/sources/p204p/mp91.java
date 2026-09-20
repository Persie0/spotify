package p204p;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mp91 {
    /* JADX INFO: renamed from: a */
    public static Type m62448a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static GenericArrayType m62449b(Type type) {
        return new f0b1.C1841a(type);
    }

    /* JADX INFO: renamed from: c */
    public static Type m62450c(Type type, Class<?> cls) {
        Type typeM62455h = m62455h(type, cls, Collection.class);
        if (typeM62455h instanceof WildcardType) {
            typeM62455h = ((WildcardType) typeM62455h).getUpperBounds()[0];
        }
        return typeM62455h instanceof ParameterizedType ? ((ParameterizedType) typeM62455h).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m62451d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m62451d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m62451d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof f0b1.C1842b ? ((f0b1.C1842b) parameterizedType).f64594c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof f0b1.C1842b ? ((f0b1.C1842b) parameterizedType2).f64594c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m62451d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m62451d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: e */
    public static String m62452e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* JADX INFO: renamed from: f */
    public static Type m62453f(Type type) {
        Class<?> clsM62454g = m62454g(type);
        return f0b1.m40463q(type, clsM62454g, clsM62454g.getGenericSuperclass());
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m62454g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m62454g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m62454g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: h */
    public static Type m62455h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return f0b1.m40463q(type, cls, f0b1.m40451e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: i */
    public static Type[] m62456i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM62455h = m62455h(type, cls, Map.class);
        return typeM62455h instanceof ParameterizedType ? ((ParameterizedType) typeM62455h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: j */
    public static ParameterizedType m62457j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new f0b1.C1842b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* JADX INFO: renamed from: k */
    public static WildcardType m62458k(Type type) {
        return new f0b1.C1843c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f0b1.f64587b);
    }

    /* JADX INFO: renamed from: l */
    public static WildcardType m62459l(Type type) {
        return new f0b1.C1843c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}
