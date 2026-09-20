package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gvg1 extends gbh1 {
    private static final gvg1 zzi;
    private int zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private double zzg;
    private double zzh;

    static {
        gvg1 gvg1Var = new gvg1();
        zzi = gvg1Var;
        gbh1.m44223h(gvg1.class, gvg1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gvg1();
        }
        if (i2 == 4) {
            return new p7f1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
