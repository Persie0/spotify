package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cah1 extends laf1 {
    private static final cah1 zze;
    private static volatile obf1 zzf;
    private int zza;
    private zaf1 zzd = rbf1.f197590e;

    static {
        cah1 cah1Var = new cah1();
        zze = cah1Var;
        laf1.m58546m(cah1.class, cah1Var);
    }

    /* JADX INFO: renamed from: w */
    public static q9h1 m32055w() {
        return (q9h1) zze.m58556i();
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
            return new sbf1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzd", aah1.class});
        }
        if (i2 == 3) {
            return new cah1();
        }
        if (i2 == 4) {
            return new q9h1(zze);
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
        synchronized (cah1.class) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m32056x(int i) {
        this.zza = i;
    }

    /* JADX INFO: renamed from: y */
    public final void m32057y(aah1 aah1Var) {
        zaf1 zaf1Var = this.zzd;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zzd = zaf1Var.zzg(size + size);
        }
        this.zzd.add(aah1Var);
    }
}
