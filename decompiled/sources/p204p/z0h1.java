package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z0h1 extends gbh1 {
    private static final z0h1 zzi;
    private int zzb;
    private Object zze;
    private int zzf;
    private int zzd = 0;
    private String zzg = "";
    private qbh1 zzh = ich1.f100820e;

    static {
        z0h1 z0h1Var = new z0h1();
        zzi = z0h1Var;
        gbh1.m44223h(z0h1.class, z0h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"zze", "zzd", "zzb", "zzf", fkr0.f70603Z0, "zzg", "zzh", e3h1.class, h7h1.class, g7h1.class});
        }
        if (i2 == 3) {
            return new z0h1();
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
