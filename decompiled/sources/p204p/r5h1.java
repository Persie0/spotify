package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class r5h1 extends gbh1 {
    private static final r5h1 zze;
    private int zzb;
    private gvg1 zzd;

    static {
        r5h1 r5h1Var = new r5h1();
        zze = r5h1Var;
        gbh1.m44223h(r5h1.class, r5h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new r5h1();
        }
        if (i2 == 4) {
            return new o1h1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
