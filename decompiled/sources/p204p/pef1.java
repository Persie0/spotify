package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pef1 extends laf1 {
    private static final pef1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private String zzd = "";
    private qff1 zze;

    static {
        pef1 pef1Var = new pef1();
        zzf = pef1Var;
        laf1.m58546m(pef1.class, pef1Var);
    }

    /* JADX INFO: renamed from: w */
    public static oef1 m69723w() {
        return (oef1) zzf.m58556i();
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
            return new sbf1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new pef1();
        }
        if (i2 == 4) {
            return new oef1(zzf);
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
        synchronized (pef1.class) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m69724x(qff1 qff1Var) {
        this.zze = qff1Var;
        this.zza |= 2;
    }
}
