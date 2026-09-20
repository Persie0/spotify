package p204p;

import com.google.android.recaptcha.internal.zzagk;

/* JADX INFO: loaded from: classes4.dex */
public final class p9h1 extends laf1 {
    private static final p9h1 zze;
    private static volatile obf1 zzf;
    private int zza;
    private zaf1 zzd = rbf1.f197590e;

    static {
        p9h1 p9h1Var = new p9h1();
        zze = p9h1Var;
        laf1.m58546m(p9h1.class, p9h1Var);
    }

    /* JADX INFO: renamed from: A */
    public static k9h1 m69388A() {
        return (k9h1) zze.m58556i();
    }

    /* JADX INFO: renamed from: z */
    public static p9h1 m69389z(byte[] bArr, haf1 haf1Var) throws zzagk {
        laf1 laf1VarM58552s = laf1.m58552s(zze, bArr, bArr.length, haf1Var);
        laf1.m58553t(laf1VarM58552s);
        return (p9h1) laf1VarM58552s;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m69390B(int i) {
        this.zza = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m69391C(o9h1 o9h1Var) {
        zaf1 zaf1Var = this.zzd;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zzd = zaf1Var.zzg(size + size);
        }
        this.zzd.add(o9h1Var);
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
            return new sbf1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzd", o9h1.class});
        }
        if (i2 == 3) {
            return new p9h1();
        }
        if (i2 == 4) {
            return new k9h1(zze);
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
        synchronized (p9h1.class) {
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
    public final int m69392w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final zaf1 m69393x() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: y */
    public final int m69394y() {
        return this.zzd.size();
    }
}
