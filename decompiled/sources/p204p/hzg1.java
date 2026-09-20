package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hzg1 extends gbh1 {
    private static final hzg1 zzg;
    private int zzb;
    private int zzd = 0;
    private Object zze;
    private long zzf;

    static {
        hzg1 hzg1Var = new hzg1();
        zzg = hzg1Var;
        gbh1.m44223h(hzg1.class, hzg1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzg, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zze", "zzd", "zzb", "zzf"});
        }
        if (i2 == 3) {
            return new hzg1();
        }
        if (i2 == 4) {
            return new p7f1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
