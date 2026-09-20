package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/pnx;", "Lp/ixh0;", "Lp/qnx;", "material3"}, m24213k = 1, m24214mv = {2, 0, 0}, m24216xi = 48)
final class pnx extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final dr4 f179539a;

    public pnx(dr4 dr4Var) {
        this.f179539a = dr4Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        qnx qnxVar = new qnx();
        qnxVar.f190716M0 = this.f179539a;
        return qnxVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((qnx) exh0Var).f190716M0 = this.f179539a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pnx) {
            return this.f179539a == ((pnx) obj).f179539a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f179539a.hashCode();
    }
}
