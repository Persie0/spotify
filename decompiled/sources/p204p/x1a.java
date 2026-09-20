package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x1a implements h3a {

    /* JADX INFO: renamed from: a */
    public final b2a f257109a;

    /* JADX INFO: renamed from: b */
    public final a0a f257110b;

    /* JADX INFO: renamed from: c */
    public final c9k f257111c;

    /* JADX INFO: renamed from: d */
    public final zv41 f257112d = jag1.m52819d(gbu.f78413a);

    /* JADX INFO: renamed from: e */
    public final zv41 f257113e = jag1.m52819d(nau.f152117a);

    /* JADX INFO: renamed from: f */
    public final zv41 f257114f = jag1.m52819d(ynj0.f274464a);

    /* JADX INFO: renamed from: g */
    public final hb11 f257115g = j0g1.m52092t(0, 1, 0, 5);

    public x1a(b2a b2aVar, luk lukVar, a0a a0aVar) {
        this.f257109a = b2aVar;
        this.f257110b = a0aVar;
        this.f257111c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), lukVar));
    }

    @Override // p204p.h3a
    public final void start() {
        if (this.f257110b.isEnabled()) {
            wxf1.m89255l(this.f257111c, b0g1.m27776L(mvl0.m62953p(new ea5(cct.m32301F(tug1.m81569g(cct.m32297B(this.f257113e, this.f257115g, m1k.f138999Q0), this.f257112d)), this, 21)), new gw8(this, null, 20)));
        }
    }

    @Override // p204p.h3a
    public final void stop() throws Throwable {
        if (this.f257110b.isEnabled()) {
            qlg1.m73215t(this.f257111c.f35578a);
            b2a b2aVar = this.f257109a;
            eh00 eh00Var = b2aVar.f22548g;
            if (eh00Var != null) {
                eh00Var.invoke();
            }
            b2aVar.f22548g = null;
            zv41 zv41Var = this.f257113e;
            zv41Var.getClass();
            zv41Var.m97091m(null, nau.f152117a);
            zv41 zv41Var2 = this.f257114f;
            zv41Var2.getClass();
            zv41Var2.m97091m(null, ynj0.f274464a);
            this.f257115g.mo46963e();
        }
    }
}
