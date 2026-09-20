package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/pj50;", "Lp/ixh0;", "Lp/qj50;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class pj50 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final int f178170a;

    /* JADX INFO: renamed from: b */
    public final boolean f178171b;

    public pj50(int i, boolean z) {
        this.f178170a = i;
        this.f178171b = z;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        qj50 qj50Var = new qj50();
        qj50Var.f189158M0 = this.f178170a;
        qj50Var.f189159N0 = this.f178171b;
        return qj50Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        qj50 qj50Var = (qj50) exh0Var;
        qj50Var.f189158M0 = this.f178170a;
        qj50Var.f189159N0 = this.f178171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        pj50 pj50Var = obj instanceof pj50 ? (pj50) obj : null;
        return pj50Var != null && this.f178170a == pj50Var.f178170a && this.f178171b == pj50Var.f178171b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178171b) + (edb.m38547C(this.f178170a) * 31);
    }
}
