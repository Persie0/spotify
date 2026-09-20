package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class bff1 extends laf1 {
    private static final bff1 zzn;
    private static volatile obf1 zzo;
    private int zza;
    private tef1 zzk;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzl = "";
    private String zzm = "";

    static {
        bff1 bff1Var = new bff1();
        zzn = bff1Var;
        laf1.m58546m(bff1.class, bff1Var);
    }

    /* JADX INFO: renamed from: w */
    public static wef1 m29020w() {
        return (wef1) zzn.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m29021A(String str) {
        this.zza |= 8;
        this.zzg = "mobile_client/authentication";
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m29022B(tef1 tef1Var) {
        Objects.requireNonNull(tef1Var);
        this.zzk = tef1Var;
        this.zza |= 128;
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
            return new sbf1(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007\tለ\b\nለ\t", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new bff1();
        }
        if (i2 == 4) {
            return new wef1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzo;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (bff1.class) {
            try {
                kaf1Var = zzo;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzn);
                    zzo = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m29023x(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m29024y(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m29025z(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
    }
}
