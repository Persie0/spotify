package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lt0 implements pzo0 {

    /* JADX INFO: renamed from: a */
    public final xre f136645a;

    /* JADX INFO: renamed from: b */
    public final luk f136646b;

    /* JADX INFO: renamed from: c */
    public final zv41 f136647c;

    /* JADX INFO: renamed from: d */
    public final kmx f136648d;

    /* JADX INFO: renamed from: e */
    public final zv41 f136649e;

    /* JADX INFO: renamed from: f */
    public final kmx f136650f;

    public lt0(xre xreVar, luk lukVar) {
        this.f136645a = xreVar;
        this.f136646b = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f136647c = zv41VarM52819d;
        this.f136648d = new kmx(zv41VarM52819d, 8);
        zv41 zv41VarM52819d2 = jag1.m52819d(null);
        this.f136649e = zv41VarM52819d2;
        this.f136650f = new kmx(zv41VarM52819d2, 8);
    }

    @Override // p204p.pzo0
    /* JADX INFO: renamed from: a */
    public final ozo0 mo32013a(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar, String str) {
        return new mt0(this.f136645a, this.f136647c, this.f136649e, this.f136646b, yzo0Var, noo0Var);
    }

    /* JADX INFO: renamed from: b */
    public final kmx m59853b() {
        return this.f136650f;
    }
}
