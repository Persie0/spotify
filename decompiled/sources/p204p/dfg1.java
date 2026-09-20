package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dfg1 extends r3g1 {
    private static final dfg1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        dfg1 dfg1Var = new dfg1();
        zzb = dfg1Var;
        r3g1.m74640f(dfg1.class, dfg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m35887p(dfg1 dfg1Var, int i) {
        dfg1Var.zzg = i - 1;
        dfg1Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: q */
    public static oeg1 m35888q() {
        return (oeg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: s */
    public static void m35889s(dfg1 dfg1Var, hgg1 hgg1Var) {
        dfg1Var.zzh = hgg1Var.f91162a;
        dfg1Var.zzd |= 2;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m35890t(dfg1 dfg1Var, shg1 shg1Var) {
        dfg1Var.zzf = shg1Var;
        dfg1Var.zze = 2;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m35891u(dfg1 dfg1Var, qig1 qig1Var) {
        dfg1Var.zzf = qig1Var;
        dfg1Var.zze = 4;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m35892v(dfg1 dfg1Var, lkg1 lkg1Var) {
        dfg1Var.zzf = lkg1Var;
        dfg1Var.zze = 3;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", hxf1.f96217c, shg1.class, lkg1.class, qig1.class, "zzh", hxf1.f96219e});
        }
        if (i2 == 3) {
            return new dfg1();
        }
        if (i2 == 4) {
            return new oeg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public final qig1 m35893r() {
        return this.zze == 4 ? (qig1) this.zzf : qig1.m72855p();
    }
}
