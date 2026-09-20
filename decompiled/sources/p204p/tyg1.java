package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tyg1 extends gbh1 {
    private static final tyg1 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        tyg1 tyg1Var = new tyg1();
        zzf = tyg1Var;
        gbh1.m44223h(tyg1.class, tyg1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new tyg1();
        }
        if (i2 == 4) {
            return new p7f1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
