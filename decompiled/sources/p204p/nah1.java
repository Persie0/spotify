package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nah1 extends laf1 {
    private static final nah1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private int zzd;
    private int zze;

    static {
        nah1 nah1Var = new nah1();
        zzf = nah1Var;
        laf1.m58546m(nah1.class, nah1Var);
    }

    /* JADX INFO: renamed from: A */
    public static nah1 m63988A() {
        return zzf;
    }

    /* JADX INFO: renamed from: z */
    public static mah1 m63989z() {
        return (mah1) zzf.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m63990B(c9h1 c9h1Var) {
        this.zza = c9h1Var.zza();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m63991C(c9h1 c9h1Var) {
        this.zzd = c9h1Var.zza();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m63992D(int i) {
        this.zze = i;
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
            return new sbf1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new nah1();
        }
        if (i2 == 4) {
            return new mah1(zzf);
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
        synchronized (nah1.class) {
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

    /* JADX INFO: renamed from: w */
    public final c9h1 m63993w() {
        c9h1 c9h1VarM31959a = c9h1.m31959a(this.zza);
        return c9h1VarM31959a == null ? c9h1.UNRECOGNIZED : c9h1VarM31959a;
    }

    /* JADX INFO: renamed from: x */
    public final c9h1 m63994x() {
        c9h1 c9h1VarM31959a = c9h1.m31959a(this.zzd);
        return c9h1VarM31959a == null ? c9h1.UNRECOGNIZED : c9h1VarM31959a;
    }

    /* JADX INFO: renamed from: y */
    public final int m63995y() {
        return this.zze;
    }
}
