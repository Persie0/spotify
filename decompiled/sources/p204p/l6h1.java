package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l6h1 extends qlf1 {
    private static final l6h1 zzb;
    private int zze;
    private l4h1 zzg;
    private byte zzh = 2;
    private int zzf = 1;

    static {
        l6h1 l6h1Var = new l6h1();
        zzb = l6h1Var;
        qlf1.m73183f(l6h1.class, l6h1Var);
    }

    /* JADX INFO: renamed from: h */
    public static htg1 m58337h() {
        return (htg1) ((hlf1) zzb.mo58162b(5, null));
    }

    /* JADX INFO: renamed from: j */
    public static l6h1 m58338j() {
        return zzb;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m58339k(l4h1 l4h1Var, l6h1 l6h1Var) {
        l6h1Var.zzg = l4h1Var;
        l6h1Var.zze |= 2;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m58340m(l6h1 l6h1Var, int i) {
        l6h1Var.zzf = i;
        l6h1Var.zze |= 1;
    }

    @Override // p204p.qlf1
    /* JADX INFO: renamed from: b */
    public final Object mo58162b(int i, qlf1 qlf1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new ytf1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"zze", "zzf", zxg1.f287319a, "zzg"});
        }
        if (i2 == 3) {
            return new l6h1();
        }
        if (i2 == 4) {
            return new htg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qlf1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final l4h1 m58341i() {
        l4h1 l4h1Var = this.zzg;
        return l4h1Var == null ? l4h1.m58158v() : l4h1Var;
    }

    /* JADX INFO: renamed from: l */
    public final int m58342l() {
        int iM33923w = cuf1.m33923w(this.zzf);
        if (iM33923w == 0) {
            return 1;
        }
        return iM33923w;
    }
}
