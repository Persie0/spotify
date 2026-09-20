package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i3h1 extends gbh1 {
    private static final i3h1 zzg;
    private int zzb;
    private long zzd;
    private pbh1 zze;
    private pbh1 zzf;

    static {
        i3h1 i3h1Var = new i3h1();
        zzg = i3h1Var;
        gbh1.m44223h(i3h1.class, i3h1Var);
    }

    public i3h1() {
        wbh1 wbh1Var = wbh1.f249760e;
        this.zze = wbh1Var;
        this.zzf = wbh1Var;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new i3h1();
        }
        if (i2 == 4) {
            return new o1h1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
