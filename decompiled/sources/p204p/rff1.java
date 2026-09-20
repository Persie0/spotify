package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rff1 extends laf1 {
    private static final rff1 zzf;
    private static volatile obf1 zzg;
    private String zza = "";
    private String zzd = "";
    private String zze = "";

    static {
        rff1 rff1Var = new rff1();
        zzf = rff1Var;
        laf1.m58546m(rff1.class, rff1Var);
    }

    @Override // p204p.laf1
    /* JADX INFO: renamed from: u */
    public final Object mo25248u(int i) {
        obf1 kaf1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sbf1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new rff1();
        }
        if (i2 == 4) {
            return new pcf1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzg;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (rff1.class) {
            try {
                kaf1Var = zzg;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzf);
                    zzg = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
