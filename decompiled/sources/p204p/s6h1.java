package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s6h1 extends gbh1 {
    private static final s6h1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private qbh1 zzf;
    private qbh1 zzg;
    private boolean zzh;

    static {
        s6h1 s6h1Var = new s6h1();
        zzi = s6h1Var;
        gbh1.m44223h(s6h1.class, s6h1Var);
    }

    public s6h1() {
        ich1 ich1Var = ich1.f100820e;
        this.zzf = ich1Var;
        this.zzg = ich1Var;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဇ\u0002", new Object[]{"zzb", "zzd", wnq0.f253255b1, "zze", "zzf", e6h1.class, "zzg", o6h1.class, "zzh"});
        }
        if (i2 == 3) {
            return new s6h1();
        }
        if (i2 == 4) {
            return new g6h1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
