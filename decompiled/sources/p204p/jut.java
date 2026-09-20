package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jut implements dxt {

    /* JADX INFO: renamed from: a */
    public final cq6 f116154a;

    /* JADX INFO: renamed from: b */
    public final qe70 f116155b;

    /* JADX INFO: renamed from: c */
    public final qe70 f116156c;

    /* JADX INFO: renamed from: d */
    public final uam0 f116157d;

    /* JADX INFO: renamed from: e */
    public boolean f116158e;

    /* JADX INFO: renamed from: g */
    public aq6 f116160g;

    /* JADX INFO: renamed from: h */
    public aq6 f116161h;

    /* JADX INFO: renamed from: i */
    public xpi0 f116162i;

    /* JADX INFO: renamed from: j */
    public bwr f116163j;

    /* JADX INFO: renamed from: f */
    public boolean f116159f = true;

    /* JADX INFO: renamed from: k */
    public final hut f116164k = new hut(this);

    /* JADX INFO: renamed from: l */
    public final b5p f116165l = new b5p(this, 22);

    /* JADX INFO: renamed from: m */
    public final iut f116166m = new iut(this);

    /* JADX WARN: Multi-variable type inference failed */
    public jut(cq6 cq6Var, loi0 loi0Var, eh00 eh00Var, eh00 eh00Var2, uam0 uam0Var) {
        this.f116154a = cq6Var;
        this.f116155b = (qe70) eh00Var;
        this.f116156c = (qe70) eh00Var2;
        this.f116157d = uam0Var;
    }

    @Override // p204p.dxt
    /* JADX INFO: renamed from: a */
    public final void mo37273a(cxt cxtVar) {
        siv0 siv0Var = ((axt) cxtVar).f20990a;
        xpi0 xpi0Var = new xpi0(siv0Var.f209670a, siv0Var.f209671b, siv0Var.f209672c, siv0Var.f209673d);
        this.f116162i = xpi0Var;
        aq6 aq6Var = this.f116161h;
        if (aq6Var != null) {
            this.f116154a.mo33602j(aq6Var, xpi0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [p.eh00, p.qe70] */
    @Override // p204p.dxt
    /* JADX INFO: renamed from: b */
    public final void mo37274b(boolean z) {
        if (this.f116158e != z) {
            this.f116158e = z;
            hut hutVar = this.f116164k;
            cq6 cq6Var = this.f116154a;
            if (z) {
                cq6Var.mo33597d(hutVar);
                uam0 uam0Var = this.f116157d;
                this.f116163j = uam0Var != null ? uam0Var.mo70589b(this.f116165l) : null;
                m54346d();
                return;
            }
            aq6 aq6Var = this.f116161h;
            if (aq6Var != null) {
                cq6Var.mo33598e(aq6Var);
            }
            this.f116161h = null;
            cq6Var.mo33595a(hutVar);
            bwr bwrVar = this.f116163j;
            if (bwrVar != null) {
                bwrVar.dispose();
            }
            this.f116163j = null;
            this.f116156c.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54345c(String str) {
        aq6 aq6Var = this.f116160g;
        if (wj50.m88271j(str, aq6Var != null ? aq6Var.f18090a : null)) {
            return;
        }
        aq6 aq6Var2 = this.f116161h;
        if (aq6Var2 != null) {
            this.f116154a.mo33598e(aq6Var2);
        }
        this.f116161h = null;
        this.f116162i = null;
        this.f116160g = str != null ? new aq6(str) : null;
        m54346d();
    }

    /* JADX INFO: renamed from: d */
    public final void m54346d() {
        aq6 aq6Var = this.f116160g;
        boolean z = this.f116158e;
        cq6 cq6Var = this.f116154a;
        if (!z || !this.f116159f || aq6Var == null) {
            aq6 aq6Var2 = this.f116161h;
            if (aq6Var2 != null) {
                cq6Var.mo33598e(aq6Var2);
            }
            this.f116161h = null;
            return;
        }
        if (wj50.m88271j(this.f116161h, aq6Var)) {
            return;
        }
        cq6Var.mo33596c(aq6Var);
        this.f116161h = aq6Var;
        xpi0 xpi0Var = this.f116162i;
        if (xpi0Var != null) {
            cq6Var.mo33602j(aq6Var, xpi0Var);
        }
    }
}
