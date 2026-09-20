package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bxf1 extends r3g1 {
    private static final bxf1 zzb;
    private int zzd;
    private String zze = "";

    static {
        bxf1 bxf1Var = new bxf1();
        zzb = bxf1Var;
        r3g1.m74640f(bxf1.class, bxf1Var);
    }

    /* JADX INFO: renamed from: p */
    public static wwf1 m30822p() {
        return (wwf1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m30823q(bxf1 bxf1Var, String str) {
        bxf1Var.zzd |= 1;
        bxf1Var.zze = str;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new bxf1();
        }
        if (i2 == 4) {
            return new wwf1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
