package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ghg1 extends r3g1 {
    private static final ghg1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        ghg1 ghg1Var = new ghg1();
        zzb = ghg1Var;
        r3g1.m74640f(ghg1.class, ghg1Var);
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ghg1();
        }
        if (i2 == 4) {
            return new wfg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
