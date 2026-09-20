package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p204p.c5a1;
import p204p.f3t0;
import p204p.rc9;
import p204p.twe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0048e extends AbstractC0044a {
    private static Map<Object, AbstractC0048e> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C0054k unknownFields;

    public AbstractC0048e() {
        this.memoizedHashCode = 0;
        this.unknownFields = C0054k.f873f;
        this.memoizedSerializedSize = -1;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0048e m518e(Class cls) {
        AbstractC0048e abstractC0048e = defaultInstanceMap.get(cls);
        if (abstractC0048e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0048e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0048e != null) {
            return abstractC0048e;
        }
        AbstractC0048e abstractC0048e2 = (AbstractC0048e) ((AbstractC0048e) c5a1.m31465a(cls)).mo521d(6);
        if (abstractC0048e2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0048e2);
        return abstractC0048e2;
    }

    /* JADX INFO: renamed from: f */
    public static Object m519f(Method method, AbstractC0048e abstractC0048e, Object... objArr) {
        try {
            return method.invoke(abstractC0048e, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m520h(Class cls, AbstractC0048e abstractC0048e) {
        defaultInstanceMap.put(cls, abstractC0048e);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0044a
    /* JADX INFO: renamed from: a */
    public final int mo426a() {
        if (this.memoizedSerializedSize == -1) {
            f3t0 f3t0Var = f3t0.f65577c;
            f3t0Var.getClass();
            this.memoizedSerializedSize = f3t0Var.m40698a(getClass()).mo544d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0044a
    /* JADX INFO: renamed from: c */
    public final void mo428c(twe tweVar) {
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        f3t0Var.m40698a(getClass()).mo546f(this, rc9.m75215a(tweVar));
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo521d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0048e) mo521d(6)).getClass().isInstance(obj)) {
            return false;
        }
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        return f3t0Var.m40698a(getClass()).mo548h(this, (AbstractC0048e) obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m522g() {
        byte bByteValue = ((Byte) mo521d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        boolean zMo542b = f3t0Var.m40698a(getClass()).mo542b(this);
        mo521d(2);
        return zMo542b;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        int iMo547g = f3t0Var.m40698a(getClass()).mo547g(this);
        this.memoizedHashCode = iMo547g;
        return iMo547g;
    }

    public final String toString() {
        return AbstractC0049f.m526d(this, super.toString());
    }
}
