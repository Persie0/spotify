package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class fff1 extends laf1 {
    private static final fff1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private tef1 zzf;

    static {
        fff1 fff1Var = new fff1();
        zzg = fff1Var;
        laf1.m58546m(fff1.class, fff1Var);
    }

    /* JADX INFO: renamed from: w */
    public static eff1 m41528w() {
        return (eff1) zzg.m58556i();
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
            return new sbf1(zzg, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ለ\u0000\u0003ለ\u0001\u0004ဉ\u0002", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new fff1();
        }
        if (i2 == 4) {
            return new eff1(zzg);
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
        synchronized (fff1.class) {
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
    public final /* synthetic */ void m41529x(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m41530y(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m41531z(tef1 tef1Var) {
        this.zzf = tef1Var;
        this.zza |= 4;
    }
}
