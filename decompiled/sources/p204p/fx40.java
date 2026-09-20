package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class fx40 extends exh0 implements ce91 {

    /* JADX INFO: renamed from: M0 */
    public tvd1 f74238M0;

    /* JADX INFO: renamed from: N0 */
    public tvd1 f74239N0;

    public fx40() {
        jez jezVar = rfg1.f198648a;
        this.f74238M0 = jezVar;
        this.f74239N0 = jezVar;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public void mo25064A1() {
        this.f74239N0 = this.f74238M0;
        vj50.m85716D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ex40(this, 0));
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        this.f74238M0 = rfg1.f198648a;
    }

    /* JADX INFO: renamed from: H1 */
    public abstract tvd1 mo42989H1(tvd1 tvd1Var);

    /* JADX INFO: renamed from: I1 */
    public void mo42990I1() {
        this.f74239N0 = mo42989H1(this.f74238M0);
        vj50.m85716D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ex40(this, 0));
    }

    @Override // p204p.ce91
    /* JADX INFO: renamed from: r */
    public final Object mo26917r() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public void mo25074z1() {
        vj50.m85714B(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ex40(this, 1));
        mo42990I1();
    }
}
