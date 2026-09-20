package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h5h1 extends gbh1 {
    private static final h5h1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        h5h1 h5h1Var = new h5h1();
        zzf = h5h1Var;
        gbh1.m44223h(h5h1.class, h5h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            mmq0 mmq0Var = mmq0.f145219b1;
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", mmq0Var, "zze", mmq0Var});
        }
        if (i2 == 3) {
            return new h5h1();
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
