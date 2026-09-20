package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class mef1 extends laf1 {
    private static final mef1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private qff1 zze;
    private String zzd = "";
    private s9f1 zzf = s9f1.f206952b;

    static {
        mef1 mef1Var = new mef1();
        zzg = mef1Var;
        laf1.m58546m(mef1.class, mef1Var);
    }

    /* JADX INFO: renamed from: w */
    public static lef1 m61570w() {
        return (lef1) zzg.m58556i();
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
            return new sbf1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new mef1();
        }
        if (i2 == 4) {
            return new lef1(zzg);
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
        synchronized (mef1.class) {
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
    public final /* synthetic */ void m61571x(qff1 qff1Var) {
        this.zze = qff1Var;
        this.zza |= 2;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m61572y(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 4;
        this.zzf = s9f1Var;
    }
}
