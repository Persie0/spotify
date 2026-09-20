package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class vpc1 extends jq20 {

    /* JADX INFO: renamed from: w0 */
    public int f243666w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public int f243667x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f243668y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f243669z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public int f243659A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f243660B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public boolean f243661C0 = false;

    /* JADX INFO: renamed from: D0 */
    public int f243662D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f243663E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public final b29 f243664F0 = new b29();

    /* JADX INFO: renamed from: G0 */
    public c29 f243665G0 = null;

    @Override // p204p.jq20
    /* JADX INFO: renamed from: Y */
    public final void mo54029Y() {
        for (int i = 0; i < this.f114775v0; i++) {
            v7j v7jVar = this.f114774u0[i];
            if (v7jVar != null) {
                v7jVar.f238206G = true;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo35147Z(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: a0 */
    public final void m86121a0(v7j v7jVar, u7j u7jVar, int i, u7j u7jVar2, int i2) {
        c29 c29Var;
        v7j v7jVar2;
        while (true) {
            c29Var = this.f243665G0;
            if (c29Var != null || (v7jVar2 = this.f238221V) == null) {
                break;
            } else {
                this.f243665G0 = ((w7j) v7jVar2).f248712y0;
            }
        }
        b29 b29Var = this.f243664F0;
        b29Var.f22527a = u7jVar;
        b29Var.f22528b = u7jVar2;
        b29Var.f22529c = i;
        b29Var.f22530d = i2;
        c29Var.mo31319b(v7jVar, b29Var);
        v7jVar.m84872T(b29Var.f22531e);
        v7jVar.m84867O(b29Var.f22532f);
        v7jVar.f238205F = b29Var.f22534h;
        v7jVar.m84863K(b29Var.f22533g);
    }
}
