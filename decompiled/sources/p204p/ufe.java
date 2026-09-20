package p204p;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
abstract class ufe<T> {

    /* JADX INFO: renamed from: p.ufe$a */
    public class C2452a extends ufe<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Constructor f229791a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f229792b;

        public C2452a(Constructor constructor, Class cls) {
            this.f229791a = constructor;
            this.f229792b = cls;
        }

        @Override // p204p.ufe
        /* JADX INFO: renamed from: b */
        public T mo82987b() {
            return (T) this.f229791a.newInstance(null);
        }

        public String toString() {
            return this.f229792b.getName();
        }
    }

    /* JADX INFO: renamed from: p.ufe$b */
    public class C2453b extends ufe<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Method f229793a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f229794b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Class f229795c;

        public C2453b(Method method, Object obj, Class cls) {
            this.f229793a = method;
            this.f229794b = obj;
            this.f229795c = cls;
        }

        @Override // p204p.ufe
        /* JADX INFO: renamed from: b */
        public T mo82987b() {
            return (T) this.f229793a.invoke(this.f229794b, this.f229795c);
        }

        public String toString() {
            return this.f229795c.getName();
        }
    }

    /* JADX INFO: renamed from: p.ufe$c */
    public class C2454c extends ufe<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Method f229796a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f229797b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f229798c;

        public C2454c(Method method, Class cls, int i) {
            this.f229796a = method;
            this.f229797b = cls;
            this.f229798c = i;
        }

        @Override // p204p.ufe
        /* JADX INFO: renamed from: b */
        public T mo82987b() {
            return (T) this.f229796a.invoke(null, this.f229797b, Integer.valueOf(this.f229798c));
        }

        public String toString() {
            return this.f229797b.getName();
        }
    }

    /* JADX INFO: renamed from: p.ufe$d */
    public class C2455d extends ufe<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Method f229799a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f229800b;

        public C2455d(Method method, Class cls) {
            this.f229799a = method;
            this.f229800b = cls;
        }

        @Override // p204p.ufe
        /* JADX INFO: renamed from: b */
        public T mo82987b() {
            return (T) this.f229799a.invoke(null, this.f229800b, Object.class);
        }

        public String toString() {
            return this.f229800b.getName();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> ufe<T> m82986a(Class<?> cls) {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new C2452a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of ".concat(cls.getName()));
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C2453b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C2454c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new C2455d(declaredMethod3, cls);
        } catch (InvocationTargetException e) {
            throw f0b1.m40466t(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo82987b();
}
