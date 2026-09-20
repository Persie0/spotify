package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lxg1 extends gbh1 {
    private static final lxg1 zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        lxg1 lxg1Var = new lxg1();
        zzi = lxg1Var;
        gbh1.m44223h(lxg1.class, lxg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static ixg1 m60194m() {
        return (ixg1) zzi.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", loq0.f135527d1, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new lxg1();
        }
        if (i2 == 4) {
            return new ixg1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m60195n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m60196o(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m60197p(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m60198q(int i) {
        this.zzb |= 16;
        this.zzh = i;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m60199r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
