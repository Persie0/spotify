package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x7h1 extends qlf1 {
    private static final x7h1 zzb;
    private int zze;
    private l6h1 zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        x7h1 x7h1Var = new x7h1();
        zzb = x7h1Var;
        qlf1.m73183f(x7h1.class, x7h1Var);
    }

    /* JADX INFO: renamed from: h */
    public static srg1 m90147h() {
        return (srg1) ((hlf1) zzb.mo58162b(5, null));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m90148k(x7h1 x7h1Var, String str) {
        str.getClass();
        x7h1Var.zze |= 1;
        x7h1Var.zzf = str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m90149l(x7h1 x7h1Var, l6h1 l6h1Var) {
        l6h1Var.getClass();
        x7h1Var.zzg = l6h1Var;
        x7h1Var.zze |= 2;
    }

    @Override // p204p.qlf1
    /* JADX INFO: renamed from: b */
    public final Object mo58162b(int i, qlf1 qlf1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new ytf1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new x7h1();
        }
        if (i2 == 4) {
            return new srg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qlf1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final l6h1 m90150i() {
        l6h1 l6h1Var = this.zzg;
        return l6h1Var == null ? l6h1.m58338j() : l6h1Var;
    }

    /* JADX INFO: renamed from: j */
    public final String m90151j() {
        return this.zzf;
    }
}
