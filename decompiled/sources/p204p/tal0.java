package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/tal0;", "Lp/ixh0;", "Lp/ual0;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class tal0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f218630a;

    public tal0(gh00 gh00Var) {
        this.f218630a = gh00Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        ual0 ual0Var = new ual0();
        ual0Var.f228513M0 = this.f218630a;
        return ual0Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ((ual0) exh0Var).f228513M0 = this.f218630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tal0) {
            return this.f218630a == ((tal0) obj).f218630a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f218630a.hashCode();
    }
}
