package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class txg1 extends gbh1 {
    private static final txg1 zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        txg1 txg1Var = new txg1();
        zzi = txg1Var;
        gbh1.m44223h(txg1.class, txg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static rxg1 m81915m() {
        return (rxg1) zzi.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", pqq0.f180386b1, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new txg1();
        }
        if (i2 == 4) {
            return new rxg1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m81916n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m81917o(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m81918p(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m81919q(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m81920r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
