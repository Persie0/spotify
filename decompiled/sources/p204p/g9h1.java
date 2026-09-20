package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g9h1 extends laf1 {
    private static final g9h1 zzf;
    private static volatile obf1 zzg;
    private String zza = "";
    private s9f1 zzd = s9f1.f206952b;
    private int zze;

    static {
        g9h1 g9h1Var = new g9h1();
        zzf = g9h1Var;
        laf1.m58546m(g9h1.class, g9h1Var);
    }

    /* JADX INFO: renamed from: y */
    public static e9h1 m44041y() {
        return (e9h1) zzf.m58556i();
    }

    /* JADX INFO: renamed from: z */
    public static g9h1 m44042z() {
        return zzf;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m44043A(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m44044B(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzd = s9f1Var;
    }

    /* JADX INFO: renamed from: C */
    public final int m44045C() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m44046D(int i) {
        this.zze = i - 2;
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
            return new sbf1(zzf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new g9h1();
        }
        if (i2 == 4) {
            return new e9h1(zzf);
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
        synchronized (g9h1.class) {
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
    public final String m44047w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m44048x() {
        return this.zzd;
    }
}
