package p204p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class t4a1 extends x4a1 {
    public t4a1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: c */
    public final void mo60796c(long j, byte[] bArr, long j2) {
        this.f258034a.copyMemory((Object) null, j, bArr, b5a1.f23539f, j2);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: d */
    public final boolean mo60797d(long j, Object obj) {
        return this.f258034a.getBoolean(obj, j);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: e */
    public final byte mo60798e(long j) {
        return this.f258034a.getByte(j);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: f */
    public final byte mo60799f(long j, Object obj) {
        return this.f258034a.getByte(obj, j);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: g */
    public final double mo60800g(long j, Object obj) {
        return this.f258034a.getDouble(obj, j);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: h */
    public final float mo60801h(long j, Object obj) {
        return this.f258034a.getFloat(obj, j);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: m */
    public final void mo60802m(Object obj, long j, boolean z) {
        this.f258034a.putBoolean(obj, j, z);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: n */
    public final void mo60803n(Object obj, long j, byte b) {
        this.f258034a.putByte(obj, j, b);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: o */
    public final void mo60804o(Object obj, long j, double d) {
        this.f258034a.putDouble(obj, j, d);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: p */
    public final void mo60805p(Object obj, long j, float f) {
        this.f258034a.putFloat(obj, j, f);
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: t */
    public final boolean mo80058t() {
        if (!super.mo80058t()) {
            return false;
        }
        try {
            Class<?> cls = this.f258034a.getClass();
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
            b5a1.m28154a(th);
            return false;
        }
    }

    @Override // p204p.x4a1
    /* JADX INFO: renamed from: u */
    public final boolean mo60806u() {
        Unsafe unsafe = this.f258034a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (b5a1.m28158e() != null) {
                    try {
                        Class<?> cls3 = this.f258034a.getClass();
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
                        b5a1.m28154a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                b5a1.m28154a(th2);
            }
        }
        return false;
    }
}
