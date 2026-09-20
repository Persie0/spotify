package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/vq51;", "Lp/ixh0;", "Lp/xq51;", "foundation"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class vq51 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f243881a;

    public vq51(eh00 eh00Var) {
        this.f243881a = eh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new xq51(this.f243881a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((xq51) exh0Var).f264880O0 = this.f243881a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vq51) {
            return this.f243881a == ((vq51) obj).f243881a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f243881a.hashCode();
    }
}
