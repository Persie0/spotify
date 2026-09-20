package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class u5h1 extends gbh1 {
    private static final u5h1 zzm;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private int zzk;
    private boolean zzl;

    static {
        u5h1 u5h1Var = new u5h1();
        zzm = u5h1Var;
        gbh1.m44223h(u5h1.class, u5h1Var);
    }

    /* JADX INFO: renamed from: m */
    public static t5h1 m82406m() {
        return (t5h1) zzm.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", koq0.f124889a1, "zzl"});
        }
        if (i2 == 3) {
            return new u5h1();
        }
        if (i2 == 4) {
            return new t5h1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m82407n(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m82408o(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m82409p(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m82410q(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m82411r(String str) {
        str.getClass();
        this.zzb |= 16;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m82412s(String str) {
        str.getClass();
        this.zzb |= 32;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m82413t(int i) {
        this.zzk = i - 1;
        this.zzb |= 128;
    }
}
