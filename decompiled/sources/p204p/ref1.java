package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ref1 extends laf1 {
    private static final ref1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private nef1 zzd;
    private String zze = "";
    private String zzf = "";

    static {
        ref1 ref1Var = new ref1();
        zzg = ref1Var;
        laf1.m58546m(ref1.class, ref1Var);
    }

    /* JADX INFO: renamed from: A */
    public static obf1 m75396A() {
        return (obf1) zzg.mo25248u(7);
    }

    /* JADX INFO: renamed from: z */
    public static qef1 m75397z() {
        return (qef1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m75398B(nef1 nef1Var) {
        Objects.requireNonNull(nef1Var);
        this.zzd = nef1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m75399C(String str) {
        this.zza |= 2;
        this.zze = "18.9.2";
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m75400D(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
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
            return new sbf1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ref1();
        }
        if (i2 == 4) {
            return new qef1(zzg);
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
        synchronized (ref1.class) {
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

    /* JADX INFO: renamed from: w */
    public final nef1 m75401w() {
        nef1 nef1Var = this.zzd;
        return nef1Var == null ? nef1.m64260z() : nef1Var;
    }

    /* JADX INFO: renamed from: x */
    public final String m75402x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final String m75403y() {
        return this.zzf;
    }
}
