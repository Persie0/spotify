package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qze implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f194188b;

    public /* synthetic */ qze(Object obj, int i) {
        this.f194187a = i;
        this.f194188b = obj;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        float fM84031v;
        switch (this.f194187a) {
            case 0:
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) >= 0.0f) {
                    return 0L;
                }
                rze rzeVar = (rze) this.f194188b;
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                uum0 uum0Var = rzeVar.f204143b;
                float fM63436m = n0e1.m63436m(uum0Var.m84031v() + fIntBitsToFloat, -rzeVar.f204142a.m86437v(), 0.0f);
                float fM84031v2 = fM63436m - uum0Var.m84031v();
                uum0Var.m84032w(fM63436m);
                return (((long) Float.floatToRawIntBits(fM84031v2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            default:
                nmr0 nmr0Var = (nmr0) this.f194188b;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                if (fIntBitsToFloat2 < 0.0f) {
                    uum0 uum0Var2 = nmr0Var.f156254c;
                    float fM84031v3 = uum0Var2.m84031v();
                    uum0Var2.m84032w(n0e1.m63436m(uum0Var2.m84031v() + fIntBitsToFloat2, -nmr0Var.m65156a(), 0.0f));
                    fM84031v = uum0Var2.m84031v() - fM84031v3;
                } else {
                    fM84031v = 0.0f;
                }
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM84031v)));
        }
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        float fM84031v;
        switch (this.f194187a) {
            case 0:
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.0f) {
                    return 0L;
                }
                rze rzeVar = (rze) this.f194188b;
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                uum0 uum0Var = rzeVar.f204143b;
                float fM63436m = n0e1.m63436m(uum0Var.m84031v() + fIntBitsToFloat, -rzeVar.f204142a.m86437v(), 0.0f);
                float fM84031v2 = fM63436m - uum0Var.m84031v();
                uum0Var.m84032w(fM63436m);
                return (4294967295L & ((long) Float.floatToRawIntBits(fM84031v2))) | (Float.floatToRawIntBits(0.0f) << 32);
            default:
                nmr0 nmr0Var = (nmr0) this.f194188b;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                if (fIntBitsToFloat2 > 0.0f) {
                    uum0 uum0Var2 = nmr0Var.f156254c;
                    float fM84031v3 = uum0Var2.m84031v();
                    uum0Var2.m84032w(n0e1.m63436m(uum0Var2.m84031v() + fIntBitsToFloat2, -nmr0Var.m65156a(), 0.0f));
                    fM84031v = uum0Var2.m84031v() - fM84031v3;
                } else {
                    fM84031v = 0.0f;
                }
                return (((long) Float.floatToRawIntBits(fM84031v)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
    }
}
