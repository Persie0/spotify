package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class o4a1 extends w4a1 {
    public o4a1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo58132c(long j, Object obj) {
        if (a5a1.f12477h) {
            return a5a1.m24784g(j, obj) != 0;
        }
        return a5a1.m24785h(j, obj) != 0;
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: d */
    public final byte mo58133d(long j, Object obj) {
        return a5a1.f12477h ? a5a1.m24784g(j, obj) : a5a1.m24785h(j, obj);
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: e */
    public final double mo58134e(long j, Object obj) {
        return Double.longBitsToDouble(m87172h(j, obj));
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: f */
    public final float mo58135f(long j, Object obj) {
        return Float.intBitsToFloat(m87171g(j, obj));
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: k */
    public final void mo58136k(Object obj, long j, boolean z) {
        if (a5a1.f12477h) {
            a5a1.m24788k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            a5a1.m24789l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: l */
    public final void mo58137l(Object obj, long j, byte b) {
        if (a5a1.f12477h) {
            a5a1.m24788k(obj, j, b);
        } else {
            a5a1.m24789l(obj, j, b);
        }
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: m */
    public final void mo58138m(Object obj, long j, double d) {
        m87176p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p204p.w4a1
    /* JADX INFO: renamed from: n */
    public final void mo58139n(Object obj, long j, float f) {
        m87175o(j, obj, Float.floatToIntBits(f));
    }
}
