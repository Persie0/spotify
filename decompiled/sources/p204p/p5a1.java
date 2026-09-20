package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/p5a1;", "Lp/ixh0;", "Lp/q5a1;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class p5a1 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f174130a;

    /* JADX INFO: renamed from: b */
    public final float f174131b;

    public p5a1(float f, float f2) {
        this.f174130a = f;
        this.f174131b = f2;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        q5a1 q5a1Var = new q5a1();
        q5a1Var.f185490M0 = this.f174130a;
        q5a1Var.f185491N0 = this.f174131b;
        return q5a1Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        q5a1 q5a1Var = (q5a1) exh0Var;
        q5a1Var.f185490M0 = this.f174130a;
        q5a1Var.f185491N0 = this.f174131b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p5a1)) {
            return false;
        }
        p5a1 p5a1Var = (p5a1) obj;
        return ybs.m93301b(this.f174130a, p5a1Var.f174130a) && ybs.m93301b(this.f174131b, p5a1Var.f174131b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f174131b) + (Float.hashCode(this.f174130a) * 31);
    }
}
