package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p204p.AbstractC2205o8;
import p204p.a5a1;
import p204p.bva;
import p204p.c3t0;
import p204p.fva;
import p204p.gj5;
import p204p.kgy0;
import p204p.m110;
import p204p.ztx;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0156e extends AbstractC2205o8 {
    private static Map<Object, AbstractC0156e> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C0162k unknownFields;

    public AbstractC0156e() {
        this.memoizedHashCode = 0;
        this.unknownFields = C0162k.f2382f;
        this.memoizedSerializedSize = -1;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0156e m1795g(Class cls) {
        AbstractC0156e abstractC0156e = defaultInstanceMap.get(cls);
        if (abstractC0156e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0156e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0156e != null) {
            return abstractC0156e;
        }
        AbstractC0156e abstractC0156e2 = (AbstractC0156e) ((AbstractC0156e) a5a1.m24778a(cls)).mo1803f(6);
        if (abstractC0156e2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0156e2);
        return abstractC0156e2;
    }

    /* JADX INFO: renamed from: h */
    public static Object m1796h(Method method, AbstractC0156e abstractC0156e, Object... objArr) {
        try {
            return method.invoke(abstractC0156e, objArr);
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

    /* JADX INFO: renamed from: j */
    public static AbstractC0156e m1797j(AbstractC0156e abstractC0156e, fva fvaVar, ztx ztxVar) throws InvalidProtocolBufferException {
        bva bvaVar = (bva) fvaVar;
        byte[] bArr = bvaVar.f31316d;
        int iMo30597j = bvaVar.mo30597j();
        int size = bvaVar.size();
        C0152a c0152a = new C0152a(bArr, iMo30597j, size, true);
        try {
            c0152a.m1682e(size);
            AbstractC0156e abstractC0156e2 = (AbstractC0156e) abstractC0156e.mo1803f(4);
            try {
                c3t0 c3t0Var = c3t0.f33758c;
                c3t0Var.getClass();
                kgy0 kgy0VarM31410a = c3t0Var.m31410a(abstractC0156e2.getClass());
                C0153b c0153b = c0152a.f159105c;
                if (c0153b == null) {
                    c0153b = new C0153b(c0152a);
                }
                kgy0VarM31410a.mo1838j(abstractC0156e2, c0153b, ztxVar);
                kgy0VarM31410a.mo1829a(abstractC0156e2);
                if (c0152a.f2346i != 0) {
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
                if (abstractC0156e2.m1804i()) {
                    return abstractC0156e2;
                }
                throw new UninitializedMessageException().m1679a();
            } catch (IOException e) {
                if (e.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e.getCause());
                }
                throw new InvalidProtocolBufferException(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e2.getCause());
                }
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0156e m1798k(AbstractC0156e abstractC0156e, byte[] bArr, ztx ztxVar) throws InvalidProtocolBufferException {
        int length = bArr.length;
        AbstractC0156e abstractC0156e2 = (AbstractC0156e) abstractC0156e.mo1803f(4);
        try {
            c3t0 c3t0Var = c3t0.f33758c;
            c3t0Var.getClass();
            kgy0 kgy0VarM31410a = c3t0Var.m31410a(abstractC0156e2.getClass());
            kgy0VarM31410a.mo1837i(abstractC0156e2, bArr, 0, length, new gj5(ztxVar));
            kgy0VarM31410a.mo1829a(abstractC0156e2);
            if (abstractC0156e2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (abstractC0156e2.m1804i()) {
                return abstractC0156e2;
            }
            throw new UninitializedMessageException().m1679a();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m1678f();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1799l(Class cls, AbstractC0156e abstractC0156e) {
        defaultInstanceMap.put(cls, abstractC0156e);
    }

    @Override // p204p.AbstractC2205o8
    /* JADX INFO: renamed from: a */
    public final int mo1800a() {
        if (this.memoizedSerializedSize == -1) {
            c3t0 c3t0Var = c3t0.f33758c;
            c3t0Var.getClass();
            this.memoizedSerializedSize = c3t0Var.m31410a(getClass()).mo1835g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // p204p.AbstractC2205o8
    /* JADX INFO: renamed from: d */
    public final void mo1801d(C0154c c0154c) {
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        c3t0Var.m31410a(getClass()).mo1832d(this, C0155d.m1756a(c0154c));
    }

    /* JADX INFO: renamed from: e */
    public final m110 m1802e() {
        return (m110) mo1803f(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0156e) mo1803f(6)).getClass().isInstance(obj)) {
            return false;
        }
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        return c3t0Var.m31410a(getClass()).mo1833e(this, (AbstractC0156e) obj);
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo1803f(int i);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        int iMo1834f = c3t0Var.m31410a(getClass()).mo1834f(this);
        this.memoizedHashCode = iMo1834f;
        return iMo1834f;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1804i() {
        byte bByteValue = ((Byte) mo1803f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        boolean zMo1830b = c3t0Var.m31410a(getClass()).mo1830b(this);
        mo1803f(2);
        return zMo1830b;
    }

    public final String toString() {
        return AbstractC0157f.m1808d(this, super.toString());
    }
}
