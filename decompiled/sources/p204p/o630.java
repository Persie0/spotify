package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/o630;", "Lp/ixh0;", "Lp/p630;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class o630 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final ub9 f162196a;

    public o630(ub9 ub9Var) {
        this.f162196a = ub9Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        p630 p630Var = new p630();
        p630Var.f174277M0 = this.f162196a;
        return p630Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((p630) exh0Var).f174277M0 = this.f162196a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o630 o630Var = obj instanceof o630 ? (o630) obj : null;
        if (o630Var == null) {
            return false;
        }
        return this.f162196a.equals(o630Var.f162196a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f162196a.f228656a);
    }
}
