package p204p;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ey0 implements hk60.InterfaceC1945e {

    /* JADX INFO: renamed from: a */
    private final List<AbstractC1837f> f63882a;

    /* JADX INFO: renamed from: b */
    private final List<AbstractC1837f> f63883b;

    /* JADX INFO: renamed from: p.ey0$a */
    /* JADX INFO: loaded from: classes11.dex */
    public class C1832a extends hk60<Object> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC1837f f63884a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ hk60 f63885b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ p0i0 f63886c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1837f f63887d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Set f63888e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Type f63889f;

        public C1832a(AbstractC1837f abstractC1837f, hk60 hk60Var, p0i0 p0i0Var, AbstractC1837f abstractC1837f2, Set set, Type type) {
            this.f63884a = abstractC1837f;
            this.f63885b = hk60Var;
            this.f63886c = p0i0Var;
            this.f63887d = abstractC1837f2;
            this.f63888e = set;
            this.f63889f = type;
        }

        @Override // p204p.hk60
        public Object fromJson(xl60 xl60Var) throws IOException {
            AbstractC1837f abstractC1837f = this.f63887d;
            if (abstractC1837f == null) {
                return this.f63885b.fromJson(xl60Var);
            }
            if (!abstractC1837f.f63907g && xl60Var.mo51068B() == xl60.EnumC2579c.NULL) {
                xl60Var.mo51085t();
                return null;
            }
            try {
                return this.f63887d.mo40283b(this.f63886c, xl60Var);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + xl60Var.m91387h(), cause);
            }
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, Object obj) throws IOException {
            AbstractC1837f abstractC1837f = this.f63884a;
            if (abstractC1837f == null) {
                this.f63885b.toJson(rm60Var, obj);
                return;
            }
            if (!abstractC1837f.f63907g && obj == null) {
                rm60Var.mo56895t();
                return;
            }
            try {
                abstractC1837f.mo40281e(this.f63886c, rm60Var, obj);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + rm60Var.m75910n(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f63888e + "(" + this.f63889f + ")";
        }
    }

    /* JADX INFO: renamed from: p.ey0$b */
    public class C1833b extends AbstractC1837f {
        public C1833b(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: e */
        public void mo40281e(p0i0 p0i0Var, rm60 rm60Var, Object obj) {
            m40285d(rm60Var, obj);
        }
    }

    /* JADX INFO: renamed from: p.ey0$c */
    public class C1834c extends AbstractC1837f {

        /* JADX INFO: renamed from: h */
        private hk60<Object> f63891h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ Type[] f63892i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ Type f63893j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f63894k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ Set f63895l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1834c(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i, i2, z);
            this.f63892i = typeArr;
            this.f63893j = type2;
            this.f63894k = set2;
            this.f63895l = set3;
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: a */
        public void mo40282a(p0i0 p0i0Var, hk60.InterfaceC1945e interfaceC1945e) {
            super.mo40282a(p0i0Var, interfaceC1945e);
            this.f63891h = (mp91.m62451d(this.f63892i[0], this.f63893j) && this.f63894k.equals(this.f63895l)) ? p0i0Var.m68708j(interfaceC1945e, this.f63893j, this.f63895l) : p0i0Var.m68705e(this.f63893j, this.f63895l);
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: e */
        public void mo40281e(p0i0 p0i0Var, rm60 rm60Var, Object obj) {
            this.f63891h.toJson(rm60Var, m40284c(obj));
        }
    }

    /* JADX INFO: renamed from: p.ey0$d */
    public class C1835d extends AbstractC1837f {
        public C1835d(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: b */
        public Object mo40283b(p0i0 p0i0Var, xl60 xl60Var) {
            return m40284c(xl60Var);
        }
    }

    /* JADX INFO: renamed from: p.ey0$e */
    public class C1836e extends AbstractC1837f {

        /* JADX INFO: renamed from: h */
        hk60<Object> f63896h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ Type[] f63897i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ Type f63898j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f63899k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ Set f63900l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1836e(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i, i2, z);
            this.f63897i = typeArr;
            this.f63898j = type2;
            this.f63899k = set2;
            this.f63900l = set3;
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: a */
        public void mo40282a(p0i0 p0i0Var, hk60.InterfaceC1945e interfaceC1945e) {
            super.mo40282a(p0i0Var, interfaceC1945e);
            this.f63896h = (mp91.m62451d(this.f63897i[0], this.f63898j) && this.f63899k.equals(this.f63900l)) ? p0i0Var.m68708j(interfaceC1945e, this.f63897i[0], this.f63899k) : p0i0Var.m68705e(this.f63897i[0], this.f63899k);
        }

        @Override // p204p.ey0.AbstractC1837f
        /* JADX INFO: renamed from: b */
        public Object mo40283b(p0i0 p0i0Var, xl60 xl60Var) {
            return m40284c(this.f63896h.fromJson(xl60Var));
        }
    }

    /* JADX INFO: renamed from: p.ey0$f */
    public static abstract class AbstractC1837f {

        /* JADX INFO: renamed from: a */
        final Type f63901a;

        /* JADX INFO: renamed from: b */
        final Set<? extends Annotation> f63902b;

        /* JADX INFO: renamed from: c */
        final Object f63903c;

        /* JADX INFO: renamed from: d */
        final Method f63904d;

        /* JADX INFO: renamed from: e */
        final int f63905e;

        /* JADX INFO: renamed from: f */
        final hk60<?>[] f63906f;

        /* JADX INFO: renamed from: g */
        final boolean f63907g;

        public AbstractC1837f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.f63901a = f0b1.m40447a(type);
            this.f63902b = set;
            this.f63903c = obj;
            this.f63904d = method;
            this.f63905e = i2;
            this.f63906f = new hk60[i - i2];
            this.f63907g = z;
        }

        /* JADX INFO: renamed from: a */
        public void mo40282a(p0i0 p0i0Var, hk60.InterfaceC1945e interfaceC1945e) {
            if (this.f63906f.length > 0) {
                Type[] genericParameterTypes = this.f63904d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f63904d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.f63905e; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setM40458l = f0b1.m40458l(parameterAnnotations[i]);
                    this.f63906f[i - this.f63905e] = (mp91.m62451d(this.f63901a, type) && this.f63902b.equals(setM40458l)) ? p0i0Var.m68708j(interfaceC1945e, type, setM40458l) : p0i0Var.m68705e(type, setM40458l);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public Object mo40283b(p0i0 p0i0Var, xl60 xl60Var) {
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: c */
        public Object m40284c(Object obj) {
            hk60<?>[] hk60VarArr = this.f63906f;
            Object[] objArr = new Object[hk60VarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hk60VarArr, 0, objArr, 1, hk60VarArr.length);
            try {
                return this.f63904d.invoke(this.f63903c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* JADX INFO: renamed from: d */
        public Object m40285d(Object obj, Object obj2) {
            hk60<?>[] hk60VarArr = this.f63906f;
            Object[] objArr = new Object[hk60VarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hk60VarArr, 0, objArr, 2, hk60VarArr.length);
            try {
                return this.f63904d.invoke(this.f63903c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* JADX INFO: renamed from: e */
        public void mo40281e(p0i0 p0i0Var, rm60 rm60Var, Object obj) {
            throw new AssertionError();
        }
    }

    public ey0(List<AbstractC1837f> list, List<AbstractC1837f> list2) {
        this.f63882a = list;
        this.f63883b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1837f m40276a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setM40457k = f0b1.m40457k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == xl60.class && genericReturnType != cls && m40279d(1, genericParameterTypes)) {
            return new C1835d(genericReturnType, setM40457k, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new C1836e(genericReturnType, setM40457k, obj, method, genericParameterTypes.length, 1, f0b1.m40452f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, f0b1.m40458l(parameterAnnotations[0]), setM40457k);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC1837f m40277b(List<AbstractC1837f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1837f abstractC1837f = list.get(i);
            if (mp91.m62451d(abstractC1837f.f63901a, type) && abstractC1837f.f63902b.equals(set)) {
                return abstractC1837f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static ey0 m40278c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(jx71.class)) {
                    AbstractC1837f abstractC1837fM40280e = m40280e(obj, method);
                    AbstractC1837f abstractC1837fM40277b = m40277b(arrayList, abstractC1837fM40280e.f63901a, abstractC1837fM40280e.f63902b);
                    if (abstractC1837fM40277b != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + abstractC1837fM40277b.f63904d + "\n    " + abstractC1837fM40280e.f63904d);
                    }
                    arrayList.add(abstractC1837fM40280e);
                }
                if (method.isAnnotationPresent(be00.class)) {
                    AbstractC1837f abstractC1837fM40276a = m40276a(obj, method);
                    AbstractC1837f abstractC1837fM40277b2 = m40277b(arrayList2, abstractC1837fM40276a.f63901a, abstractC1837fM40276a.f63902b);
                    if (abstractC1837fM40277b2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + abstractC1837fM40277b2.f63904d + "\n    " + abstractC1837fM40276a.f63904d);
                    }
                    arrayList2.add(abstractC1837fM40276a);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
        }
        return new ey0(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m40279d(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            Type type = typeArr[i];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != hk60.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1837f m40280e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == rm60.class && genericReturnType == cls && m40279d(2, genericParameterTypes)) {
            return new C1833b(genericParameterTypes[1], f0b1.m40458l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length != 1 || genericReturnType == cls) {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        }
        Set<? extends Annotation> setM40457k = f0b1.m40457k(method);
        Set<? extends Annotation> setM40458l = f0b1.m40458l(parameterAnnotations[0]);
        return new C1834c(genericParameterTypes[0], setM40458l, obj, method, genericParameterTypes.length, 1, f0b1.m40452f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setM40458l, setM40457k);
    }

    @Override // p204p.hk60.InterfaceC1945e
    public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
        AbstractC1837f abstractC1837fM40277b = m40277b(this.f63882a, type, set);
        AbstractC1837f abstractC1837fM40277b2 = m40277b(this.f63883b, type, set);
        hk60 hk60VarM68708j = null;
        if (abstractC1837fM40277b == null && abstractC1837fM40277b2 == null) {
            return null;
        }
        if (abstractC1837fM40277b == null || abstractC1837fM40277b2 == null) {
            try {
                hk60VarM68708j = p0i0Var.m68708j(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder sbM38572u = edb.m38572u("No ", abstractC1837fM40277b == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbM38572u.append(f0b1.m40467u(type, set));
                throw new IllegalArgumentException(sbM38572u.toString(), e);
            }
        }
        hk60 hk60Var = hk60VarM68708j;
        if (abstractC1837fM40277b != null) {
            abstractC1837fM40277b.mo40282a(p0i0Var, this);
        }
        if (abstractC1837fM40277b2 != null) {
            abstractC1837fM40277b2.mo40282a(p0i0Var, this);
        }
        return new C1832a(abstractC1837fM40277b, hk60Var, p0i0Var, abstractC1837fM40277b2, set, type);
    }
}
