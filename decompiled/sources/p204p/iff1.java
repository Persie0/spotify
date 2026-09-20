package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class iff1 extends laf1 {
    private static final iff1 zzh;
    private static volatile obf1 zzi;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        iff1 iff1Var = new iff1();
        zzh = iff1Var;
        laf1.m58546m(iff1.class, iff1Var);
    }

    /* JADX INFO: renamed from: w */
    public static hff1 m50437w() {
        return (hff1) zzh.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m50438A(String str) {
        Objects.requireNonNull(str);
        this.zza |= 8;
        this.zzg = str;
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
            return new sbf1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new iff1();
        }
        if (i2 == 4) {
            return new hff1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzi;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (iff1.class) {
            try {
                kaf1Var = zzi;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzh);
                    zzi = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m50439x(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m50440y(String str) {
        this.zza |= 2;
        this.zze = "18.9.2";
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m50441z(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
    }
}
