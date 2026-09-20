package p204p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class k4a1 extends v4a1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f119169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4a1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f119169b = i;
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: c */
    public final boolean mo55361c(long j, Object obj) {
        switch (this.f119169b) {
            case 0:
                return z4a1.f279185g ? z4a1.m95327b(j, obj) : z4a1.m95328c(j, obj);
            default:
                return z4a1.f279185g ? z4a1.m95327b(j, obj) : z4a1.m95328c(j, obj);
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: d */
    public final double mo55362d(long j, Object obj) {
        switch (this.f119169b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m84643g(j, obj));
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: e */
    public final float mo55363e(long j, Object obj) {
        switch (this.f119169b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m84642f(j, obj));
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: j */
    public final void mo55364j(Object obj, long j, boolean z) {
        switch (this.f119169b) {
            case 0:
                if (!z4a1.f279185g) {
                    z4a1.m95337l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    z4a1.m95336k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!z4a1.f279185g) {
                    z4a1.m95337l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    z4a1.m95336k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: k */
    public final void mo55365k(Object obj, long j, byte b) {
        switch (this.f119169b) {
            case 0:
                if (!z4a1.f279185g) {
                    z4a1.m95337l(obj, j, b);
                } else {
                    z4a1.m95336k(obj, j, b);
                }
                break;
            default:
                if (!z4a1.f279185g) {
                    z4a1.m95337l(obj, j, b);
                } else {
                    z4a1.m95336k(obj, j, b);
                }
                break;
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: l */
    public final void mo55366l(Object obj, long j, double d) {
        switch (this.f119169b) {
            case 0:
                m84647o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m84647o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: m */
    public final void mo55367m(Object obj, long j, float f) {
        switch (this.f119169b) {
            case 0:
                m84646n(j, obj, Float.floatToIntBits(f));
                break;
            default:
                m84646n(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p204p.v4a1
    /* JADX INFO: renamed from: r */
    public final boolean mo55368r() {
        switch (this.f119169b) {
        }
        return false;
    }
}
