package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y5a1 {

    /* JADX INFO: renamed from: a */
    public final float f269383a;

    /* JADX INFO: renamed from: b */
    public final xuk f269384b;

    /* JADX INFO: renamed from: c */
    public final hyc f269385c;

    /* JADX INFO: renamed from: d */
    public final uum0 f269386d = new uum0(0.0f);

    /* JADX INFO: renamed from: e */
    public di41 f269387e;

    /* JADX INFO: renamed from: f */
    public boolean f269388f;

    public y5a1(float f, xuk xukVar, hyc hycVar) {
        this.f269383a = f;
        this.f269384b = xukVar;
        this.f269385c = hycVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m92844a(float f) {
        uum0 uum0Var = this.f269386d;
        float fM84031v = uum0Var.m84031v() + f;
        float f2 = this.f269383a;
        uum0Var.m84032w(n0e1.m63436m(fM84031v, -f2, f2));
        if (this.f269388f || Math.abs(uum0Var.m84031v()) != f2) {
            return;
        }
        this.f269388f = true;
        this.f269385c.invoke();
    }
}
