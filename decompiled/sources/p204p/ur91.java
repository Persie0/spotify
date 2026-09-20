package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ur91 {

    /* JADX INFO: renamed from: a */
    public final fjf0 f233288a;

    /* JADX INFO: renamed from: b */
    public final fea f233289b;

    /* JADX INFO: renamed from: c */
    public final xuk f233290c;

    /* JADX INFO: renamed from: d */
    public final yum0 f233291d;

    /* JADX INFO: renamed from: e */
    public final rtq f233292e;

    /* JADX INFO: renamed from: f */
    public final yum0 f233293f;

    /* JADX INFO: renamed from: g */
    public final yum0 f233294g;

    /* JADX INFO: renamed from: h */
    public final yum0 f233295h;

    /* JADX INFO: renamed from: i */
    public final yum0 f233296i;

    /* JADX INFO: renamed from: j */
    public final oa81 f233297j;

    /* JADX INFO: renamed from: k */
    public final oa81 f233298k;

    /* JADX INFO: renamed from: l */
    public final yum0 f233299l;

    /* JADX INFO: renamed from: m */
    public final yum0 f233300m;

    /* JADX INFO: renamed from: n */
    public final yum0 f233301n;

    /* JADX INFO: renamed from: o */
    public final yum0 f233302o;

    /* JADX INFO: renamed from: p */
    public tr91 f233303p;

    /* JADX INFO: renamed from: q */
    public final rtq f233304q;

    /* JADX INFO: renamed from: r */
    public final rtq f233305r;

    /* JADX INFO: renamed from: s */
    public final okj0 f233306s;

    /* JADX INFO: renamed from: t */
    public final ycm0 f233307t;

    /* JADX INFO: renamed from: u */
    public final rvw0 f233308u;

    /* JADX INFO: renamed from: v */
    public final be41 f233309v;

    public ur91(fjf0 fjf0Var, fea feaVar, xuk xukVar) {
        this.f233288a = fjf0Var;
        this.f233289b = feaVar;
        this.f233290c = xukVar;
        Boolean bool = Boolean.FALSE;
        this.f233291d = sam.m77645B(bool);
        this.f233292e = sam.m77674m(new sr91(this, 13));
        this.f233293f = sam.m77645B(bool);
        this.f233294g = sam.m77645B(bool);
        this.f233295h = sam.m77645B(bool);
        this.f233296i = sam.m77645B(bool);
        this.f233297j = new oa81(this);
        this.f233298k = new oa81(this);
        this.f233299l = sam.m77645B(null);
        this.f233300m = sam.m77645B(null);
        this.f233301n = sam.m77645B(null);
        this.f233302o = sam.m77645B(null);
        this.f233304q = sam.m77674m(new sr91(this, 11));
        this.f233305r = sam.m77674m(new sr91(this, 12));
        this.f233306s = new okj0(this);
        this.f233307t = new ycm0(this);
        this.f233308u = new rvw0(this);
        this.f233309v = new be41(this);
    }

    /* JADX INFO: renamed from: a */
    public final oa81 m83845a(lb81 lb81Var) {
        int iOrdinal = lb81Var.ordinal();
        if (iOrdinal == 0) {
            return this.f233297j;
        }
        if (iOrdinal == 1) {
            return this.f233298k;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final void m83846b(lb81 lb81Var, Integer num) {
        int iOrdinal = lb81Var.ordinal();
        if (iOrdinal == 0) {
            this.f233299l.setValue(num);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.f233300m.setValue(num);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m83847c(lb81 lb81Var, Integer num) {
        int iOrdinal = lb81Var.ordinal();
        if (iOrdinal == 0) {
            this.f233301n.setValue(num);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.f233302o.setValue(num);
        }
    }
}
