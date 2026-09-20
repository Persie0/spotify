package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/sxy;", "Lp/ixh0;", "Lp/txy;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class sxy extends ixh0 {
    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        txy txyVar = new txy();
        txyVar.f224786M0 = 1.0f;
        return txyVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((txy) exh0Var).f224786M0 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        txy txyVar = obj instanceof txy ? (txy) obj : null;
        return txyVar != null && 1.0f == txyVar.f224786M0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) * 31;
    }
}
