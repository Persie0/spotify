package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zig1 extends r3g1 {
    private static final zig1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zgg1 zzg;
    private ghg1 zzh;

    static {
        zig1 zig1Var = new zig1();
        zzb = zig1Var;
        r3g1.m74640f(zig1.class, zig1Var);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m96214p(zig1 zig1Var, dkg1 dkg1Var) {
        zig1Var.zzf = dkg1Var;
        zig1Var.zze = 4;
    }

    /* JADX INFO: renamed from: q */
    public static uig1 m96215q() {
        return (uig1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96216r(zig1 zig1Var, leg1 leg1Var) {
        zig1Var.zzf = leg1Var;
        zig1Var.zze = 2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m96217s(zig1 zig1Var, dfg1 dfg1Var) {
        zig1Var.zzf = dfg1Var;
        zig1Var.zze = 3;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m96218t(zig1 zig1Var, bgg1 bgg1Var) {
        bgg1Var.getClass();
        zig1Var.zzf = bgg1Var;
        zig1Var.zze = 7;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m96219u(zig1 zig1Var, zgg1 zgg1Var) {
        zgg1Var.getClass();
        zig1Var.zzg = zgg1Var;
        zig1Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m96220v(zig1 zig1Var, sjg1 sjg1Var) {
        zig1Var.zzf = sjg1Var;
        zig1Var.zze = 8;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", leg1.class, dfg1.class, dkg1.class, rgg1.class, "zzh", bgg1.class, sjg1.class});
        }
        if (i2 == 3) {
            return new zig1();
        }
        if (i2 == 4) {
            return new uig1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
