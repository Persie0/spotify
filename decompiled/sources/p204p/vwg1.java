package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vwg1 extends gbh1 {
    private static final vwg1 zze;
    private int zzb;
    private int zzd;

    static {
        vwg1 vwg1Var = new vwg1();
        zze = vwg1Var;
        gbh1.m44223h(vwg1.class, vwg1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", loq0.f135525c1});
        }
        if (i2 == 3) {
            return new vwg1();
        }
        if (i2 == 4) {
            return new p7f1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
