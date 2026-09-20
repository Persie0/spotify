package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lkg1 extends r3g1 {
    private static final lkg1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        lkg1 lkg1Var = new lkg1();
        zzb = lkg1Var;
        r3g1.m74640f(lkg1.class, lkg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static gkg1 m59276p() {
        return (gkg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m59277q(lkg1 lkg1Var, boolean z) {
        lkg1Var.zzd |= 8;
        lkg1Var.zzh = z;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m59278r(lkg1 lkg1Var, int i) {
        lkg1Var.zzd |= 16;
        lkg1Var.zzi = i;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m59279s(lkg1 lkg1Var, long j) {
        lkg1Var.zzd |= 4;
        lkg1Var.zzg = j;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m59280t(lkg1 lkg1Var) {
        lkg1Var.zzd |= 32;
        lkg1Var.zzj = 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m59281u(lkg1 lkg1Var) {
        lkg1Var.zzd |= 2;
        lkg1Var.zzf = true;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new lkg1();
        }
        if (i2 == 4) {
            return new gkg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
