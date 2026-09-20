package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/kfs;", "Lp/ixh0;", "Lp/jfs;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class kfs extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f122220a;

    public kfs(gh00 gh00Var) {
        this.f122220a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        jfs jfsVar = new jfs();
        jfsVar.f111963M0 = this.f122220a;
        return jfsVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((jfs) exh0Var).f111963M0 = this.f122220a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kfs) {
            return this.f122220a == ((kfs) obj).f122220a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f122220a.hashCode();
    }
}
