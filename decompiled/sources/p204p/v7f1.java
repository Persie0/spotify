package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class v7f1 extends gbh1 {
    private static final v7f1 zzg;
    private qbh1 zzb;
    private qbh1 zzd;
    private qbh1 zze;
    private qbh1 zzf;

    static {
        v7f1 v7f1Var = new v7f1();
        zzg = v7f1Var;
        gbh1.m44223h(v7f1.class, v7f1Var);
    }

    public v7f1() {
        ich1 ich1Var = ich1.f100820e;
        this.zzb = ich1Var;
        this.zzd = ich1Var;
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
            return new jch1(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzb", u7f1.class, "zzd", q7f1.class, "zze", u7f1.class, "zzf", q7f1.class});
        }
        if (i2 == 3) {
            return new v7f1();
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
