package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class b4h1 extends gbh1 {
    private static final b4h1 zzg;
    private int zzb;
    private qbh1 zzd;
    private qbh1 zze;
    private r5h1 zzf;

    static {
        b4h1 b4h1Var = new b4h1();
        zzg = b4h1Var;
        gbh1.m44223h(b4h1.class, b4h1Var);
    }

    public b4h1() {
        ich1 ich1Var = ich1.f100820e;
        this.zzd = ich1Var;
        this.zze = ich1Var;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzb", "zzd", y6h1.class, "zze", nzg1.class, "zzf"});
        }
        if (i2 == 3) {
            return new b4h1();
        }
        if (i2 == 4) {
            return new o1h1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
