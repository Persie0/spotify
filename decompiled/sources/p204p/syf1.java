package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class syf1 extends wyf1 {
    public syf1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: a */
    public final double mo71632a(Object obj, long j) {
        return Double.longBitsToDouble(m89355k(j, obj));
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: b */
    public final float mo71633b(Object obj, long j) {
        return Float.intBitsToFloat(m89354j(j, obj));
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: c */
    public final void mo71634c(Object obj, long j, boolean z) {
        if (czf1.f43558g) {
            czf1.m34438c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            czf1.m34439d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: d */
    public final void mo71635d(Object obj, long j, byte b) {
        if (czf1.f43558g) {
            czf1.m34438c(obj, j, b);
        } else {
            czf1.m34439d(obj, j, b);
        }
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: e */
    public final void mo71636e(Object obj, long j, double d) {
        m89359o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: f */
    public final void mo71637f(Object obj, long j, float f) {
        m89358n(j, obj, Float.floatToIntBits(f));
    }

    @Override // p204p.wyf1
    /* JADX INFO: renamed from: g */
    public final boolean mo71638g(Object obj, long j) {
        return czf1.f43558g ? czf1.m34444i(obj, j) : czf1.m34445j(obj, j);
    }
}
