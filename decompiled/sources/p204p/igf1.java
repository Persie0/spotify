package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class igf1 extends laf1 {
    private static final igf1 zze;
    private static volatile obf1 zzf;
    private int zza = 0;
    private Object zzd;

    static {
        igf1 igf1Var = new igf1();
        zze = igf1Var;
        laf1.m58546m(igf1.class, igf1Var);
    }

    /* JADX INFO: renamed from: y */
    public static igf1 m50515y(byte[] bArr) {
        return (igf1) laf1.m58550q(zze, bArr);
    }

    /* JADX INFO: renamed from: z */
    public static hgf1 m50516z() {
        return (hgf1) zze.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m50517A(jdf1 jdf1Var) {
        this.zzd = jdf1Var;
        this.zza = 1;
    }

    /* JADX INFO: renamed from: B */
    public final int m50518B() {
        int i = this.zza;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
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
            return new sbf1(zze, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzd", "zza", jdf1.class, qdf1.class});
        }
        if (i2 == 3) {
            return new igf1();
        }
        if (i2 == 4) {
            return new hgf1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzf;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (igf1.class) {
            try {
                kaf1Var = zzf;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zze);
                    zzf = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final jdf1 m50519w() {
        return this.zza == 1 ? (jdf1) this.zzd : jdf1.m53022B();
    }

    /* JADX INFO: renamed from: x */
    public final qdf1 m50520x() {
        return this.zza == 2 ? (qdf1) this.zzd : qdf1.m72594w();
    }
}
