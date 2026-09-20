package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/lo70;", "Lp/ixh0;", "Lp/cp70;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class lo70 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final vh00 f135324a;

    public lo70(vh00 vh00Var) {
        this.f135324a = vh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        cp70 cp70Var = new cp70();
        cp70Var.f40483M0 = this.f135324a;
        return cp70Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((cp70) exh0Var).f40483M0 = this.f135324a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lo70) {
            return this.f135324a == ((lo70) obj).f135324a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f135324a.hashCode();
    }
}
