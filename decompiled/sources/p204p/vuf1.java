package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vuf1 extends r3g1 {
    private static final vuf1 zzb;
    private int zzd;
    private bxf1 zze;
    private bxf1 zzf;
    private int zzg;

    static {
        vuf1 vuf1Var = new vuf1();
        zzb = vuf1Var;
        r3g1.m74640f(vuf1.class, vuf1Var);
    }

    /* JADX INFO: renamed from: p */
    public static ruf1 m86417p() {
        return (ruf1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m86418q(vuf1 vuf1Var, bxf1 bxf1Var) {
        vuf1Var.zze = bxf1Var;
        vuf1Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m86419r(vuf1 vuf1Var, bxf1 bxf1Var) {
        vuf1Var.zzf = bxf1Var;
        vuf1Var.zzd |= 2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m86420s(vuf1 vuf1Var, int i) {
        vuf1Var.zzg = i - 1;
        vuf1Var.zzd |= 4;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", hxf1.f96216b});
        }
        if (i2 == 3) {
            return new vuf1();
        }
        if (i2 == 4) {
            return new ruf1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
