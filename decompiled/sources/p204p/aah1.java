package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class aah1 extends laf1 {
    private static final aah1 zzg;
    private static volatile obf1 zzh;
    private String zza = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        aah1 aah1Var = new aah1();
        zzg = aah1Var;
        laf1.m58546m(aah1.class, aah1Var);
    }

    /* JADX INFO: renamed from: w */
    public static x9h1 m25246w() {
        return (x9h1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final void m25247A(int i) {
        if (i != 1) {
            this.zzf = i - 2;
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
            return new sbf1(zzg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new aah1();
        }
        if (i2 == 4) {
            return new x9h1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzh;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (aah1.class) {
            try {
                kaf1Var = zzh;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzg);
                    zzh = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m25249x(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m25250y(int i) {
        this.zze = i;
    }

    /* JADX INFO: renamed from: z */
    public final void m25251z(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            abf1.m25350a();
            throw null;
        }
    }
}
