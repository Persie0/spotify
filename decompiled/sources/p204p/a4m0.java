package p204p;

import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/a4m0;", "Lp/ixh0;", "Lp/c4m0;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class a4m0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f12280a;

    /* JADX INFO: renamed from: b */
    public final float f12281b;

    /* JADX INFO: renamed from: c */
    public final float f12282c;

    /* JADX INFO: renamed from: d */
    public final float f12283d;

    public a4m0(float f, float f2, float f3, float f4) {
        this.f12280a = f;
        this.f12281b = f2;
        this.f12282c = f3;
        this.f12283d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            kt40.m57301a("Padding must be non-negative");
        }
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        c4m0 c4m0Var = new c4m0();
        c4m0Var.f33970M0 = this.f12280a;
        c4m0Var.f33971N0 = this.f12281b;
        c4m0Var.f33972O0 = this.f12282c;
        c4m0Var.f33973P0 = this.f12283d;
        c4m0Var.f33974Q0 = true;
        return c4m0Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        c4m0 c4m0Var = (c4m0) exh0Var;
        c4m0Var.f33970M0 = this.f12280a;
        c4m0Var.f33971N0 = this.f12281b;
        c4m0Var.f33972O0 = this.f12282c;
        c4m0Var.f33973P0 = this.f12283d;
        c4m0Var.f33974Q0 = true;
    }

    public final boolean equals(Object obj) {
        a4m0 a4m0Var = obj instanceof a4m0 ? (a4m0) obj : null;
        return a4m0Var != null && ybs.m93301b(this.f12280a, a4m0Var.f12280a) && ybs.m93301b(this.f12281b, a4m0Var.f12281b) && ybs.m93301b(this.f12282c, a4m0Var.f12282c) && ybs.m93301b(this.f12283d, a4m0Var.f12283d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f12280a) * 31, 31, this.f12281b), 31, this.f12282c), 31, this.f12283d);
    }
}
