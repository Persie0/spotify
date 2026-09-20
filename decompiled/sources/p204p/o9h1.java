package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o9h1 extends laf1 {
    private static final o9h1 zzh;
    private static volatile obf1 zzi;
    private int zza;
    private g9h1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        o9h1 o9h1Var = new o9h1();
        zzh = o9h1Var;
        laf1.m58546m(o9h1.class, o9h1Var);
    }

    /* JADX INFO: renamed from: z */
    public static m9h1 m66464z() {
        return (m9h1) zzh.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m66465A(g9h1 g9h1Var) {
        this.zzd = g9h1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m66466B(int i) {
        this.zzf = i;
    }

    /* JADX INFO: renamed from: C */
    public final int m66467C() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: D */
    public final int m66468D() {
        int i = this.zzg;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    if (i != 4) {
                        i2 = i != 5 ? 0 : 7;
                    } else {
                        i2 = 6;
                    }
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public final void m66469E(int i) {
        if (i != 1) {
            this.zze = i - 2;
        } else {
            abf1.m25350a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m66470F(int i) {
        if (i != 1) {
            this.zzg = i - 2;
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
            return new sbf1(zzh, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o9h1();
        }
        if (i2 == 4) {
            return new m9h1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzi;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (o9h1.class) {
            try {
                kaf1Var = zzi;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzh);
                    zzi = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m66471w() {
        return (this.zza & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final g9h1 m66472x() {
        g9h1 g9h1Var = this.zzd;
        return g9h1Var == null ? g9h1.m44042z() : g9h1Var;
    }

    /* JADX INFO: renamed from: y */
    public final int m66473y() {
        return this.zzf;
    }
}
