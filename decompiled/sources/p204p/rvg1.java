package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rvg1 extends gbh1 {
    private static final rvg1 zzk;
    private int zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private qbh1 zzh;
    private qbh1 zzi;
    private String zzj;

    static {
        rvg1 rvg1Var = new rvg1();
        zzk = rvg1Var;
        gbh1.m44223h(rvg1.class, rvg1Var);
    }

    public rvg1() {
        ich1 ich1Var = ich1.f100820e;
        this.zzh = ich1Var;
        this.zzi = ich1Var;
        this.zzj = "";
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzk, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzb", "zzd", snq0.f211006a1, "zze", "zzf", jxq0.f117195b1, "zzg", "zzh", t3h1.class, "zzi", t3h1.class, "zzj"});
        }
        if (i2 == 3) {
            return new rvg1();
        }
        if (i2 == 4) {
            return new p7f1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
