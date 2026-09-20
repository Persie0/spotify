package p204p;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class l4h1 extends qlf1 {
    private static final l4h1 zzb;
    private int zze;
    private double zzh;
    private float zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private gnf1 zzn;
    private gnf1 zzo;
    private gnf1 zzp;
    private enf1 zzq;
    private anf1 zzr;
    private long zzs;
    private byte zzt = 2;
    private zhf1 zzf = zhf1.f282915b;
    private String zzg = "";

    static {
        l4h1 l4h1Var = new l4h1();
        zzb = l4h1Var;
        qlf1.m73183f(l4h1.class, l4h1Var);
    }

    public l4h1() {
        ttf1 ttf1Var = ttf1.f223589d;
        this.zzn = ttf1Var;
        this.zzo = ttf1Var;
        this.zzp = ttf1Var;
        this.zzq = dqf1.f51986d;
        this.zzr = clf1.f39277d;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m58143D(l4h1 l4h1Var, nhf1 nhf1Var) {
        l4h1Var.zze |= 1;
        l4h1Var.zzf = nhf1Var;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m58144E(l4h1 l4h1Var, long j) {
        l4h1Var.zze |= 16;
        l4h1Var.zzj = j;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m58145F(l4h1 l4h1Var, int i) {
        l4h1Var.zze |= 32;
        l4h1Var.zzk = i;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m58146G(l4h1 l4h1Var, int i) {
        l4h1Var.zze |= 64;
        l4h1Var.zzl = i;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m58147H(l4h1 l4h1Var, boolean z) {
        l4h1Var.zze |= 128;
        l4h1Var.zzm = z;
    }

    /* JADX INFO: renamed from: I */
    public static void m58148I(l4h1 l4h1Var, List list) {
        gnf1 gnf1Var = l4h1Var.zzn;
        if (!((kbf1) gnf1Var).f121199a) {
            l4h1Var.zzn = qlf1.m73181d(gnf1Var);
        }
        vaf1.m85079a(list, l4h1Var.zzn);
    }

    /* JADX INFO: renamed from: J */
    public static void m58149J(l4h1 l4h1Var, l6h1 l6h1Var) {
        gnf1 gnf1Var = l4h1Var.zzo;
        if (!((kbf1) gnf1Var).f121199a) {
            l4h1Var.zzo = qlf1.m73181d(gnf1Var);
        }
        l4h1Var.zzo.add(l6h1Var);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m58150K(l4h1 l4h1Var, String str) {
        l4h1Var.zze |= 2;
        l4h1Var.zzg = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m58151L(l4h1 l4h1Var, List list) {
        gnf1 gnf1Var = l4h1Var.zzp;
        if (!((kbf1) gnf1Var).f121199a) {
            l4h1Var.zzp = qlf1.m73181d(gnf1Var);
        }
        vaf1.m85079a(list, l4h1Var.zzp);
    }

    /* JADX INFO: renamed from: h */
    public static void m58152h(l4h1 l4h1Var, List list) {
        RandomAccess randomAccess = l4h1Var.zzq;
        if (!((kbf1) randomAccess).f121199a) {
            dqf1 dqf1Var = (dqf1) randomAccess;
            int i = dqf1Var.f51988c;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            l4h1Var.zzq = new dqf1(Arrays.copyOf(dqf1Var.f51987b, i2), dqf1Var.f51988c);
        }
        vaf1.m85079a(list, l4h1Var.zzq);
    }

    /* JADX INFO: renamed from: i */
    public static void m58153i(l4h1 l4h1Var, List list) {
        RandomAccess randomAccess = l4h1Var.zzr;
        if (!((kbf1) randomAccess).f121199a) {
            clf1 clf1Var = (clf1) randomAccess;
            int i = clf1Var.f39279c;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            l4h1Var.zzr = new clf1(clf1Var.f39279c, Arrays.copyOf(clf1Var.f39278b, i2));
        }
        vaf1.m85079a(list, l4h1Var.zzr);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m58154j(l4h1 l4h1Var, long j) {
        l4h1Var.zze |= 256;
        l4h1Var.zzs = j;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m58155k(l4h1 l4h1Var, double d) {
        l4h1Var.zze |= 4;
        l4h1Var.zzh = d;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m58156l(l4h1 l4h1Var, float f) {
        l4h1Var.zze |= 8;
        l4h1Var.zzi = f;
    }

    /* JADX INFO: renamed from: u */
    public static s2h1 m58157u() {
        return (s2h1) ((hlf1) zzb.mo58162b(5, null));
    }

    /* JADX INFO: renamed from: v */
    public static l4h1 m58158v() {
        return zzb;
    }

    /* JADX INFO: renamed from: A */
    public final anf1 m58159A() {
        return this.zzr;
    }

    /* JADX INFO: renamed from: B */
    public final enf1 m58160B() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: C */
    public final gnf1 m58161C() {
        return this.zzp;
    }

    @Override // p204p.qlf1
    /* JADX INFO: renamed from: b */
    public final Object mo58162b(int i, qlf1 qlf1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i2 == 2) {
            return new ytf1(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", x7h1.class, "zzo", l6h1.class, "zzp", "zzq", "zzs", "zzr"});
        }
        if (i2 == 3) {
            return new l4h1();
        }
        if (i2 == 4) {
            return new s2h1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzt = qlf1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m58163m() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: n */
    public final double m58164n() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: o */
    public final float m58165o() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: p */
    public final int m58166p() {
        return this.zzo.size();
    }

    /* JADX INFO: renamed from: q */
    public final int m58167q() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: r */
    public final int m58168r() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: s */
    public final long m58169s() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: t */
    public final long m58170t() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: w */
    public final zhf1 m58171w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final String m58172x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final gnf1 m58173y() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: z */
    public final gnf1 m58174z() {
        return this.zzn;
    }
}
