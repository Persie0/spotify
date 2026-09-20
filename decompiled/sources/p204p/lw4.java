package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lw4 implements qw4 {

    /* JADX INFO: renamed from: a */
    public final iw4 f137444a;

    /* JADX INFO: renamed from: b */
    public final iw4 f137445b;

    public lw4(iw4 iw4Var, iw4 iw4Var2) {
        this.f137444a = iw4Var;
        this.f137445b = iw4Var2;
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: j0 */
    public final mz8 mo48914j0() {
        return new x641((whz) this.f137444a.mo48914j0(), (whz) this.f137445b.mo48914j0());
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: u0 */
    public final List mo38179u0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: x0 */
    public final boolean mo38183x0() {
        return this.f137444a.mo38183x0() && this.f137445b.mo38183x0();
    }
}
