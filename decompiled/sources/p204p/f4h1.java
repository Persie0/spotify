package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f4h1 extends gbh1 {
    private static final f4h1 zze;
    private int zzb;
    private int zzd;

    static {
        f4h1 f4h1Var = new f4h1();
        zze = f4h1Var;
        gbh1.m44223h(f4h1.class, f4h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", hkr0.f92498d1});
        }
        if (i2 == 3) {
            return new f4h1();
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
