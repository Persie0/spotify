package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class r4a1 extends v4a1 {
    @Override // p204p.v4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo55361c(long j, Object obj) {
        return this.f237104a.getBoolean(obj, j);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: d */
    public final double mo55362d(long j, Object obj) {
        return this.f237104a.getDouble(obj, j);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: e */
    public final float mo55363e(long j, Object obj) {
        return this.f237104a.getFloat(obj, j);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: j */
    public final void mo55364j(Object obj, long j, boolean z) {
        this.f237104a.putBoolean(obj, j, z);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: k */
    public final void mo55365k(Object obj, long j, byte b) {
        this.f237104a.putByte(obj, j, b);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: l */
    public final void mo55366l(Object obj, long j, double d) {
        this.f237104a.putDouble(obj, j, d);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: m */
    public final void mo55367m(Object obj, long j, float f) {
        this.f237104a.putFloat(obj, j, f);
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: q */
    public final boolean mo74743q() {
        if (!super.mo74743q()) {
            return false;
        }
        try {
            Class<?> cls = this.f237104a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            z4a1.m95326a(th);
            return false;
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: r */
    public final boolean mo55368r() {
        Unsafe unsafe = this.f237104a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (z4a1.m95332g() != null) {
                    try {
                        Class<?> cls3 = this.f237104a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        z4a1.m95326a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                z4a1.m95326a(th2);
            }
        }
        return false;
    }
}
