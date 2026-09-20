package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x7q {

    /* JADX INFO: renamed from: a */
    public final c9k f258967a;

    /* JADX INFO: renamed from: b */
    public final k6i f258968b;

    /* JADX INFO: renamed from: c */
    public final C2148n1 f258969c;

    /* JADX INFO: renamed from: d */
    public final pek f258970d;

    /* JADX INFO: renamed from: e */
    public boolean f258971e;

    /* JADX INFO: renamed from: f */
    public final zv41 f258972f;

    /* JADX INFO: renamed from: g */
    public final hb11 f258973g;

    /* JADX INFO: renamed from: h */
    public ru41 f258974h;

    /* JADX INFO: renamed from: i */
    public final luu0 f258975i;

    /* JADX INFO: renamed from: j */
    public final kmx f258976j;

    /* JADX INFO: renamed from: k */
    public boolean f258977k;

    public x7q(c9k c9kVar, k6i k6iVar, C2148n1 c2148n1, pek pekVar) {
        this.f258967a = c9kVar;
        this.f258968b = k6iVar;
        this.f258969c = c2148n1;
        this.f258970d = pekVar;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f258972f = zv41VarM52819d;
        hb11 hb11VarM52092t = j0g1.m52092t(0, 0, 0, 7);
        this.f258973g = hb11VarM52092t;
        this.f258975i = bzf1.m31020l(hb11VarM52092t);
        this.f258976j = new kmx(zv41VarM52819d, 8);
    }

    /* JADX INFO: renamed from: a */
    public final void m90160a() {
        this.f258968b.invoke(this);
    }

    /* JADX INFO: renamed from: b */
    public final luu0 m90161b() {
        return this.f258975i;
    }

    /* JADX INFO: renamed from: c */
    public final xuk m90162c() {
        return this.f258967a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90163d() {
        return this.f258977k;
    }

    /* JADX INFO: renamed from: e */
    public final Object m90164e(ibk ibkVar) throws Throwable {
        if (!this.f258977k) {
            kk40.m56680v(this.f258967a, null);
            this.f258977k = true;
            Object objM90169j = m90169j(this.f258971e ? iw21.f106330c : iw21.f106331d, ibkVar);
            if (objM90169j == yuk.f276404a) {
                return objM90169j;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m90165f(b7p b7pVar) throws Throwable {
        this.f258971e = true;
        Object objM90169j = m90169j(iw21.f106329b, b7pVar);
        return objM90169j == yuk.f276404a ? objM90169j : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m90166g(b7p b7pVar) throws Throwable {
        Object objM90169j = m90169j(iw21.f106328a, b7pVar);
        return objM90169j == yuk.f276404a ? objM90169j : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public final void m90167h() {
        this.f258969c.invoke(this, 1500L);
    }

    /* JADX INFO: renamed from: i */
    public final void m90168i(ru41 ru41Var) {
        this.f258974h = ru41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m90169j(iw21 iw21Var, ibk ibkVar) throws Throwable {
        w7q w7qVar;
        if (ibkVar instanceof w7q) {
            w7qVar = (w7q) ibkVar;
            int i = w7qVar.f248734d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7qVar.f248734d = i - Integer.MIN_VALUE;
            } else {
                w7qVar = new w7q(this, ibkVar);
            }
        } else {
            w7qVar = new w7q(this, ibkVar);
        }
        Object obj = w7qVar.f248732b;
        int i2 = w7qVar.f248734d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            w7qVar.f248731a = iw21Var;
            w7qVar.f248734d = 1;
            this.f258972f.emit(iw21Var, w7qVar);
            yuk yukVar = yuk.f276404a;
            if (w2a1Var == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iw21Var = w7qVar.f248731a;
            bga.m29073P(obj);
        }
        this.f258970d.invoke(iw21Var);
        return w2a1Var;
    }
}
