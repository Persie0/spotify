package p204p;

import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0b1 {

    /* JADX INFO: renamed from: a */
    public static final Set<Annotation> f64586a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b */
    public static final Type[] f64587b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class<?> f64588c;

    /* JADX INFO: renamed from: d */
    private static final Class<? extends Annotation> f64589d;

    /* JADX INFO: renamed from: e */
    private static final Map<Class<?>, Class<?>> f64590e;

    /* JADX INFO: renamed from: p.f0b1$a */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class C1841a implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        private final Type f64591a;

        public C1841a(Type type) {
            this.f64591a = f0b1.m40447a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && mp91.m62451d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f64591a;
        }

        public int hashCode() {
            return this.f64591a.hashCode();
        }

        public String toString() {
            return f0b1.m40468v(this.f64591a) + "[]";
        }
    }

    /* JADX INFO: renamed from: p.f0b1$b */
    public static final class C1842b implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        private final Type f64592a;

        /* JADX INFO: renamed from: b */
        private final Type f64593b;

        /* JADX INFO: renamed from: c */
        public final Type[] f64594c;

        public C1842b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || mp91.m62454g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f64592a = type == null ? null : f0b1.m40447a(type);
            this.f64593b = f0b1.m40447a(type2);
            this.f64594c = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f64594c;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                f0b1.m40448b(this.f64594c[i]);
                Type[] typeArr3 = this.f64594c;
                typeArr3[i] = f0b1.m40447a(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && mp91.m62451d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f64594c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f64592a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f64593b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f64594c) ^ this.f64593b.hashCode()) ^ f0b1.m40453g(this.f64592a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f64594c.length + 1) * 30);
            sb.append(f0b1.m40468v(this.f64593b));
            if (this.f64594c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(f0b1.m40468v(this.f64594c[0]));
            for (int i = 1; i < this.f64594c.length; i++) {
                sb.append(", ");
                sb.append(f0b1.m40468v(this.f64594c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: p.f0b1$c */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class C1843c implements WildcardType {

        /* JADX INFO: renamed from: a */
        private final Type f64595a;

        /* JADX INFO: renamed from: b */
        private final Type f64596b;

        public C1843c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                f0b1.m40448b(typeArr[0]);
                this.f64596b = null;
                this.f64595a = f0b1.m40447a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            f0b1.m40448b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f64596b = f0b1.m40447a(typeArr2[0]);
            this.f64595a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && mp91.m62451d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f64596b;
            return type != null ? new Type[]{type} : f0b1.f64587b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f64595a};
        }

        public int hashCode() {
            Type type = this.f64596b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f64595a.hashCode() + 31);
        }

        public String toString() {
            if (this.f64596b != null) {
                return "? super " + f0b1.m40468v(this.f64596b);
            }
            if (this.f64595a == Object.class) {
                return "?";
            }
            return "? extends " + f0b1.m40468v(this.f64595a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f64589d = cls;
        f64588c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f64590e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m40447a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C1841a(m40447a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C1842b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1842b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C1841a ? type : new C1841a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C1843c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C1843c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: b */
    public static void m40448b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m40449c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static hk60<?> m40450d(p0i0 p0i0Var, Type type, Class<?> cls) throws NoSuchMethodException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        ok60 ok60Var = (ok60) cls.getAnnotation(ok60.class);
        Class<?> cls2 = null;
        if (ok60Var == null || !ok60Var.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(mp91.m62452e(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(p0i0.class, Type[].class);
                            objArr = new Object[]{p0i0Var, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            objArr = new Object[]{p0i0Var};
                            declaredConstructor = cls3.getDeclaredConstructor(p0i0.class);
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((hk60) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e) {
                    e = e;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (NoSuchMethodException e2) {
                e = e2;
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e5);
        } catch (InvocationTargetException e6) {
            throw m40466t(e6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Type m40451e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m40451e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m40451e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m40452f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static int m40453g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX INFO: renamed from: h */
    public static int m40454h(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m40455i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f64589d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m40456j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX INFO: renamed from: k */
    public static Set<? extends Annotation> m40457k(AnnotatedElement annotatedElement) {
        return m40458l(annotatedElement.getAnnotations());
    }

    /* JADX INFO: renamed from: l */
    public static Set<? extends Annotation> m40458l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(wl60.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f64586a;
    }

    /* JADX INFO: renamed from: m */
    public static String m40459m(String str, AnnotatedElement annotatedElement) {
        return m40460n(str, (gk60) annotatedElement.getAnnotation(gk60.class));
    }

    /* JADX INFO: renamed from: n */
    public static String m40460n(String str, gk60 gk60Var) {
        if (gk60Var != null) {
            String strName = gk60Var.name();
            if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public static JsonDataException m40461o(String str, String str2, xl60 xl60Var) {
        String string;
        String strM91387h = xl60Var.m91387h();
        if (str2.equals(str)) {
            string = edb.m38566o("Required value '", str, "' missing at ", strM91387h);
        } else {
            StringBuilder sbM38573v = edb.m38573v("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbM38573v.append(strM91387h);
            string = sbM38573v.toString();
        }
        return new JsonDataException(string);
    }

    /* JADX INFO: renamed from: p */
    public static Type m40462p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: q */
    public static Type m40463q(Type type, Class<?> cls, Type type2) {
        return m40464r(type, cls, type2, new LinkedHashSet());
    }

    /* JADX INFO: renamed from: r */
    private static Type m40464r(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        Type type3;
        WildcardType wildcardType;
        Type typeM40464r;
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m40465s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM40464r2 = m40464r(type, cls, componentType, collection);
                return componentType == typeM40464r2 ? cls2 : mp91.m62449b(typeM40464r2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM40464r3 = m40464r(type, cls, genericComponentType, collection);
            return genericComponentType == typeM40464r3 ? genericArrayType : mp91.m62449b(typeM40464r3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM40464r4 = m40464r(type, cls, ownerType, collection);
            boolean z = typeM40464r4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeM40464r5 = m40464r(type, cls, actualTypeArguments[i], collection);
                if (typeM40464r5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeM40464r5;
                }
            }
            return z ? new C1842b(typeM40464r4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM40464r6 = m40464r(type, cls, lowerBounds[0], collection);
                if (typeM40464r6 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return mp91.m62459l(typeM40464r6);
                }
            } else if (upperBounds.length == 1 && (typeM40464r = m40464r(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                return mp91.m62458k(typeM40464r);
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    /* JADX INFO: renamed from: s */
    public static Type m40465s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM40449c = m40449c(typeVariable);
        if (clsM40449c != null) {
            Type typeM40451e = m40451e(type, cls, clsM40449c);
            if (typeM40451e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM40451e).getActualTypeArguments()[m40454h(clsM40449c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX INFO: renamed from: t */
    public static RuntimeException m40466t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    /* JADX INFO: renamed from: u */
    public static String m40467u(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static String m40468v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m40469w(Type type, Type type2) {
        return mp91.m62451d(type, type2);
    }

    /* JADX INFO: renamed from: x */
    public static JsonDataException m40470x(String str, String str2, xl60 xl60Var) {
        String string;
        String strM91387h = xl60Var.m91387h();
        if (str2.equals(str)) {
            string = edb.m38566o("Non-null value '", str, "' was null at ", strM91387h);
        } else {
            StringBuilder sbM38573v = edb.m38573v("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbM38573v.append(strM91387h);
            string = sbM38573v.toString();
        }
        return new JsonDataException(string);
    }
}
