package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z4h1 extends gbh1 {
    private static final z4h1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        z4h1 z4h1Var = new z4h1();
        zzf = z4h1Var;
        gbh1.m44223h(z4h1.class, z4h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new z4h1();
        }
        if (i2 == 4) {
            return new o1h1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
