package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class m5h1 extends gbh1 {
    private static final m5h1 zzg;
    private int zzb;
    private long zzd;
    private long zze;
    private qbh1 zzf = ich1.f100820e;

    static {
        m5h1 m5h1Var = new m5h1();
        zzg = m5h1Var;
        gbh1.m44223h(m5h1.class, m5h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", p5h1.class});
        }
        if (i2 == 3) {
            return new m5h1();
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
