package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class zgg1 extends r3g1 {
    private static final zgg1 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zgg1 zgg1Var = new zgg1();
        zzb = zgg1Var;
        r3g1.m74640f(zgg1.class, zgg1Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m96082A(zgg1 zgg1Var, int i) {
        zgg1Var.zzd |= 128;
        zgg1Var.zzl = i;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m96083B(zgg1 zgg1Var, int i) {
        zgg1Var.zzd |= 256;
        zgg1Var.zzm = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m96084C(zgg1 zgg1Var, int i) {
        zgg1Var.zzd |= 8;
        zgg1Var.zzh = i;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m96085D(zgg1 zgg1Var, long j) {
        zgg1Var.zzd |= 16;
        zgg1Var.zzi = j;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m96086E(zgg1 zgg1Var, long j) {
        zgg1Var.zzd |= 32;
        zgg1Var.zzj = j;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m96087p(zgg1 zgg1Var) {
        zgg1Var.zzd |= 512;
        zgg1Var.zzn = 846465066L;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m96088q(zgg1 zgg1Var, String str) {
        str.getClass();
        zgg1Var.zzd |= 4;
        zgg1Var.zzg = str;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96089r(zgg1 zgg1Var) {
        String str = Build.BRAND;
        str.getClass();
        zgg1Var.zzd |= 1024;
        zgg1Var.zzo = str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m96090s(zgg1 zgg1Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        zgg1Var.zzd |= 8192;
        zgg1Var.zzr = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m96091t(zgg1 zgg1Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        zgg1Var.zzd |= 4096;
        zgg1Var.zzq = str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m96092u(zgg1 zgg1Var) {
        String str = Build.MODEL;
        str.getClass();
        zgg1Var.zzd |= 2048;
        zgg1Var.zzp = str;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m96093v(zgg1 zgg1Var, int i) {
        zgg1Var.zzd |= 16384;
        zgg1Var.zzs = i;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m96094w(zgg1 zgg1Var, boolean z) {
        zgg1Var.zzd |= 64;
        zgg1Var.zzk = z;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m96095x(zgg1 zgg1Var) {
        zgg1Var.zzd |= 1;
        zgg1Var.zze = "8.3.0";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m96096y(zgg1 zgg1Var, String str) {
        zgg1Var.zzd |= 2;
        zgg1Var.zzf = str;
    }

    /* JADX INFO: renamed from: z */
    public static ugg1 m96097z() {
        return (ugg1) zzb.m74650k();
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zgg1();
        }
        if (i2 == 4) {
            return new ugg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
