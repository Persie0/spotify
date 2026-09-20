package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class tef1 extends laf1 {
    private static final tef1 zzo;
    private static volatile obf1 zzp;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private vef1 zzi;
    private mef1 zzj;
    private uef1 zzk;
    private cef1 zzl;
    private pef1 zzm;
    private udf1 zzn;

    static {
        tef1 tef1Var = new tef1();
        zzo = tef1Var;
        laf1.m58546m(tef1.class, tef1Var);
    }

    /* JADX INFO: renamed from: w */
    public static sef1 m80528w() {
        return (sef1) zzo.m58556i();
    }

    /* JADX INFO: renamed from: x */
    public static tef1 m80529x() {
        return zzo;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m80530A(mef1 mef1Var) {
        this.zzj = mef1Var;
        this.zza |= 64;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m80531B(cef1 cef1Var) {
        this.zzl = cef1Var;
        this.zza |= 256;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m80532C(pef1 pef1Var) {
        this.zzm = pef1Var;
        this.zza |= 512;
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
            return new sbf1(zzo, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new tef1();
        }
        if (i2 == 4) {
            return new sef1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzp;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (tef1.class) {
            try {
                kaf1Var = zzp;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzo);
                    zzp = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80533y(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80534z() {
        this.zza &= -2;
        this.zzd = zzo.zzd;
    }
}
