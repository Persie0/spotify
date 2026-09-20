package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public final class qly0 implements omy0 {

    /* JADX INFO: renamed from: j */
    public static final t9y0 f189940j = new t9y0(new q5s0(14), new xaf(25));

    /* JADX INFO: renamed from: a */
    public final vum0 f189941a;

    /* JADX INFO: renamed from: f */
    public float f189946f;

    /* JADX INFO: renamed from: h */
    public final rtq f189948h;

    /* JADX INFO: renamed from: i */
    public final rtq f189949i;

    /* JADX INFO: renamed from: b */
    public final vum0 f189942b = bul.m30574z(0);

    /* JADX INFO: renamed from: c */
    public final vum0 f189943c = bul.m30574z(0);

    /* JADX INFO: renamed from: d */
    public final woi0 f189944d = hbg1.m47035f();

    /* JADX INFO: renamed from: e */
    public final vum0 f189945e = bul.m30574z(Alert.DURATION_SHOW_INDEFINITELY);

    /* JADX INFO: renamed from: g */
    public final r5q f189947g = j0g1.m52096x(new rv70(this, 22));

    public qly0(int i) {
        this.f189941a = bul.m30574z(i);
        final int i2 = 0;
        this.f189948h = sam.m77674m(new eh00(this) { // from class: p.oly0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qly0 f166943b;

            {
                this.f166943b = this;
            }

            @Override // p204p.eh00
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qly0 qly0Var = this.f166943b;
                        return Boolean.valueOf(qly0Var.f189941a.m86437v() < qly0Var.f189945e.m86437v());
                    default:
                        return Boolean.valueOf(this.f166943b.f189941a.m86437v() > 0);
                }
            }
        });
        final int i3 = 1;
        this.f189949i = sam.m77674m(new eh00(this) { // from class: p.oly0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qly0 f166943b;

            {
                this.f166943b = this;
            }

            @Override // p204p.eh00
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qly0 qly0Var = this.f166943b;
                        return Boolean.valueOf(qly0Var.f189941a.m86437v() < qly0Var.f189945e.m86437v());
                    default:
                        return Boolean.valueOf(this.f166943b.f189941a.m86437v() > 0);
                }
            }
        });
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: a */
    public final Object mo28414a(xqi0 xqi0Var, th00 th00Var, fbk fbkVar) {
        Object objMo28414a = this.f189947g.mo28414a(xqi0Var, th00Var, fbkVar);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: b */
    public final boolean mo28415b() {
        return this.f189947g.mo28415b();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: c */
    public final boolean mo28416c() {
        return ((Boolean) this.f189949i.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: d */
    public final boolean mo28417d() {
        return ((Boolean) this.f189948h.getValue()).booleanValue();
    }

    @Override // p204p.omy0
    /* JADX INFO: renamed from: e */
    public final float mo28418e(float f) {
        return this.f189947g.mo28418e(f);
    }

    /* JADX INFO: renamed from: f */
    public final Object m73259f(int i, n05 n05Var, ibk ibkVar) {
        Object objM68462g = oyf1.m68462g(this, i - this.f189941a.m86437v(), n05Var, ibkVar);
        return objM68462g == yuk.f276404a ? objM68462g : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public final void m73260h(int i) {
        vum0 vum0Var = this.f189941a;
        this.f189945e.m86438w(i);
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            if (vum0Var.m86437v() > i) {
                vum0Var.m86438w(i);
            }
        } finally {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
        }
    }
}
