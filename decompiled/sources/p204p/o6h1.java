package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o6h1 extends gbh1 {
    private static final o6h1 zzi;
    private int zzb;
    private int zzd;
    private long zze;
    private qbh1 zzf;
    private qbh1 zzg;
    private qbh1 zzh;

    static {
        o6h1 o6h1Var = new o6h1();
        zzi = o6h1Var;
        gbh1.m44223h(o6h1.class, o6h1Var);
    }

    public o6h1() {
        ich1 ich1Var = ich1.f100820e;
        this.zzf = ich1Var;
        this.zzg = ich1Var;
        this.zzh = ich1Var;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zzd", vnq0.f243216b1, "zze", "zzf", u5h1.class, "zzg", lxg1.class, "zzh", e6h1.class});
        }
        if (i2 == 3) {
            return new o6h1();
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
