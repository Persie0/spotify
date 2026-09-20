package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/tj50;", "Lp/ixh0;", "Lp/uj50;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class tj50 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final int f220829a;

    public tj50(int i) {
        this.f220829a = i;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        uj50 uj50Var = new uj50();
        uj50Var.f230906M0 = this.f220829a;
        uj50Var.f230907N0 = true;
        return uj50Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        uj50 uj50Var = (uj50) exh0Var;
        uj50Var.f230906M0 = this.f220829a;
        uj50Var.f230907N0 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        tj50 tj50Var = obj instanceof tj50 ? (tj50) obj : null;
        return tj50Var != null && this.f220829a == tj50Var.f220829a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (edb.m38547C(this.f220829a) * 31);
    }
}
