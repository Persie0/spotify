package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p5h1 extends gbh1 {
    private static final p5h1 zzh;
    private int zzb;
    private String zzd = "";
    private qbh1 zze;
    private qbh1 zzf;
    private boolean zzg;

    static {
        p5h1 p5h1Var = new p5h1();
        zzh = p5h1Var;
        gbh1.m44223h(p5h1.class, p5h1Var);
    }

    public p5h1() {
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
            return new jch1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zzd", "zze", m1h1.class, "zzf", tzg1.class, "zzg"});
        }
        if (i2 == 3) {
            return new p5h1();
        }
        if (i2 == 4) {
            return new o1h1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
