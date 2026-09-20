package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class eef1 extends laf1 {
    private static final eef1 zzd;
    private static volatile obf1 zze;
    private s9f1 zza = s9f1.f206952b;

    static {
        eef1 eef1Var = new eef1();
        zzd = eef1Var;
        laf1.m58546m(eef1.class, eef1Var);
    }

    /* JADX INFO: renamed from: x */
    public static eef1 m38654x() {
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
            return new sbf1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zza"});
        }
        if (i2 == 3) {
            return new eef1();
        }
        if (i2 == 4) {
            return new def1(zzd);
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
        synchronized (eef1.class) {
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
    public final s9f1 m38655w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m38656y(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza = s9f1Var;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m38657z() {
        this.zza = zzd.zza;
    }
}
