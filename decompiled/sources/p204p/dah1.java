package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dah1 extends laf1 {
    public static final /* synthetic */ int zza = 0;
    private static final dah1 zzf;
    private static volatile obf1 zzg;
    private String zzd = "";
    private zaf1 zze = rbf1.f197590e;

    static {
        dah1 dah1Var = new dah1();
        zzf = dah1Var;
        laf1.m58546m(dah1.class, dah1Var);
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
            return new sbf1(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", j9h1.class});
        }
        if (i2 == 3) {
            return new dah1();
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
        synchronized (dah1.class) {
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
