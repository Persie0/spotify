package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gah1 extends laf1 {
    private static final gah1 zzd;
    private static volatile obf1 zze;
    private int zza;

    static {
        gah1 gah1Var = new gah1();
        zzd = gah1Var;
        laf1.m58546m(gah1.class, gah1Var);
    }

    /* JADX INFO: renamed from: x */
    public static eah1 m44168x() {
        return (eah1) zzd.m58556i();
    }

    /* JADX INFO: renamed from: y */
    public static gah1 m44169y() {
        return zzd;
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
            return new sbf1(zzd, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (i2 == 3) {
            return new gah1();
        }
        if (i2 == 4) {
            return new eah1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zze;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (gah1.class) {
            try {
                kaf1Var = zze;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzd);
                    zze = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final c9h1 m44170w() {
        c9h1 c9h1VarM31959a = c9h1.m31959a(this.zza);
        return c9h1VarM31959a == null ? c9h1.UNRECOGNIZED : c9h1VarM31959a;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m44171z(c9h1 c9h1Var) {
        this.zza = c9h1Var.zza();
    }
}
