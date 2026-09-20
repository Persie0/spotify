package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/aa6;", "Lp/ixh0;", "Lp/da6;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class aa6 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f13768a;

    /* JADX INFO: renamed from: b */
    public final boolean f13769b;

    public aa6(float f, boolean z) {
        this.f13768a = f;
        this.f13769b = z;
        if (f > 0.0f) {
            return;
        }
        kt40.m57301a("aspectRatio " + f + " must be > 0");
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        da6 da6Var = new da6();
        da6Var.f46981M0 = this.f13768a;
        da6Var.f46982N0 = this.f13769b;
        return da6Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        da6 da6Var = (da6) exh0Var;
        da6Var.f46981M0 = this.f13768a;
        da6Var.f46982N0 = this.f13769b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        aa6 aa6Var = obj instanceof aa6 ? (aa6) obj : null;
        if (aa6Var != null && this.f13768a == aa6Var.f13768a) {
            if (this.f13769b == ((aa6) obj).f13769b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13769b) + (Float.hashCode(this.f13768a) * 31);
    }
}
