package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class edf0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gdf0 f58512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ edf0(gdf0 gdf0Var, int i) {
        super(1);
        this.f58511a = i;
        this.f58512b = gdf0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f58511a) {
            case 0:
                return new vwt(this.f58512b, 19);
            case 1:
                ldf0 ldf0Var = new ldf0(((Boolean) obj).booleanValue());
                gdf0 gdf0Var = this.f58512b;
                if (gdf0Var.f78842l.compareAndSet(false, true)) {
                    gdf0Var.f78840j.m61520b(ldf0Var);
                    gdf0Var.f78835e.mo55548j();
                }
                return w2a1.f247311a;
            default:
                ldf0 ldf0Var2 = new ldf0(((Boolean) obj).booleanValue());
                gdf0 gdf0Var2 = this.f58512b;
                if (gdf0Var2.f78842l.compareAndSet(false, true)) {
                    gdf0Var2.f78840j.m61520b(ldf0Var2);
                    gdf0Var2.f78835e.mo55548j();
                }
                return w2a1.f247311a;
        }
    }
}
