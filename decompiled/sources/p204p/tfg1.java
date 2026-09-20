package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tfg1 extends r3g1 {
    private static final tfg1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        tfg1 tfg1Var = new tfg1();
        zzb = tfg1Var;
        r3g1.m74640f(tfg1.class, tfg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m80670p(tfg1 tfg1Var, int i) {
        tfg1Var.zzd |= 1;
        tfg1Var.zze = i;
    }

    /* JADX INFO: renamed from: q */
    public static hfg1 m80671q() {
        return (hfg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m80672r(tfg1 tfg1Var, String str) {
        tfg1Var.zzd |= 8;
        tfg1Var.zzh = str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m80673s(tfg1 tfg1Var, String str) {
        str.getClass();
        tfg1Var.zzd |= 2;
        tfg1Var.zzf = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m80674t(tfg1 tfg1Var) {
        tfg1Var.zzd |= 32;
        tfg1Var.zzj = 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m80675u(tfg1 tfg1Var, int i) {
        tfg1Var.zzd |= 16;
        tfg1Var.zzi = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m80676v(tfg1 tfg1Var, int i) {
        tfg1Var.zzg = ilf1.m51014b(i);
        tfg1Var.zzd |= 4;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", hxf1.f96218d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new tfg1();
        }
        if (i2 == 4) {
            return new hfg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
