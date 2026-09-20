package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a7h1 extends gbh1 {
    private static final a7h1 zzh;
    private int zzb;
    private int zzd;
    private qbh1 zze;
    private qbh1 zzf;
    private int zzg;

    static {
        a7h1 a7h1Var = new a7h1();
        zzh = a7h1Var;
        gbh1.m44223h(a7h1.class, a7h1Var);
    }

    public a7h1() {
        ich1 ich1Var = ich1.f100820e;
        this.zze = ich1Var;
        this.zzf = ich1Var;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzb", "zzd", bxq0.f31959a1, "zze", t3h1.class, "zzf", t3h1.class, "zzg"});
        }
        if (i2 == 3) {
            return new a7h1();
        }
        if (i2 == 4) {
            return new g6h1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
