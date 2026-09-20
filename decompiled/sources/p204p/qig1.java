package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qig1 extends r3g1 {
    private static final qig1 zzb;
    private int zzd;
    private l4g1 zze = o9g1.f163034e;
    private String zzf = "";
    private boolean zzg;

    static {
        qig1 qig1Var = new qig1();
        zzb = qig1Var;
        r3g1.m74640f(qig1.class, qig1Var);
    }

    /* JADX INFO: renamed from: p */
    public static qig1 m72855p() {
        return zzb;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m72856q(qig1 qig1Var, boolean z) {
        qig1Var.zzd |= 2;
        qig1Var.zzg = z;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", kig1.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new qig1();
        }
        if (i2 == 4) {
            return new vhg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
