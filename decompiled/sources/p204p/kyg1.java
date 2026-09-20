package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kyg1 extends gbh1 {
    private static final kyg1 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        kyg1 kyg1Var = new kyg1();
        zzh = kyg1Var;
        gbh1.m44223h(kyg1.class, kyg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static hyg1 m57712m() {
        return (hyg1) zzh.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", crq0.f41361a1, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new kyg1();
        }
        if (i2 == 4) {
            return new hyg1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57713n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57714o(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m57715p(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m57716q(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
