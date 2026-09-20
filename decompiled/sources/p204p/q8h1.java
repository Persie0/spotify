package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q8h1 extends laf1 {
    private static final q8h1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private int zzd;
    private int zze;

    static {
        q8h1 q8h1Var = new q8h1();
        zzf = q8h1Var;
        laf1.m58546m(q8h1.class, q8h1Var);
    }

    /* JADX INFO: renamed from: x */
    public static o8h1 m72327x() {
        return (o8h1) zzf.m58556i();
    }

    /* JADX INFO: renamed from: y */
    public static q8h1 m72328y() {
        return zzf;
    }

    /* JADX INFO: renamed from: A */
    public final int m72329A() {
        int i = this.zzd;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final int m72330B() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public final void m72331C(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            abf1.m25350a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m72332D(int i) {
        if (i != 1) {
            this.zze = i - 2;
        } else {
            abf1.m25350a();
            throw null;
        }
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
            return new sbf1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new q8h1();
        }
        if (i2 == 4) {
            return new o8h1(zzf);
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
        synchronized (q8h1.class) {
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
    public final c9h1 m72333w() {
        c9h1 c9h1VarM31959a = c9h1.m31959a(this.zza);
        return c9h1VarM31959a == null ? c9h1.UNRECOGNIZED : c9h1VarM31959a;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m72334z(c9h1 c9h1Var) {
        this.zza = c9h1Var.zza();
    }
}
