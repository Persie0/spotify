package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ief1 extends laf1 {
    private static final ief1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private gef1 zzd;
    private String zze = "";
    private String zzf = "";

    static {
        ief1 ief1Var = new ief1();
        zzg = ief1Var;
        laf1.m58546m(ief1.class, ief1Var);
    }

    /* JADX INFO: renamed from: A */
    public static obf1 m50379A() {
        return (obf1) zzg.mo25248u(7);
    }

    /* JADX INFO: renamed from: z */
    public static hef1 m50380z() {
        return (hef1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m50381B(gef1 gef1Var) {
        this.zzd = gef1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m50382C(String str) {
        this.zza |= 2;
        this.zze = "18.9.2";
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m50383D(String str) {
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
            return new ief1();
        }
        if (i2 == 4) {
            return new hef1(zzg);
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
        synchronized (ief1.class) {
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
    public final gef1 m50384w() {
        gef1 gef1Var = this.zzd;
        return gef1Var == null ? gef1.m44472H() : gef1Var;
    }

    /* JADX INFO: renamed from: x */
    public final String m50385x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final String m50386y() {
        return this.zzf;
    }
}
