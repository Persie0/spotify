package p204p;

import kotlin.Metadata;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/ki21;", "Lp/ixh0;", "Lp/qi21;", "foundation-layout"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
final class ki21 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final float f122767a;

    /* JADX INFO: renamed from: b */
    public final float f122768b;

    /* JADX INFO: renamed from: c */
    public final float f122769c;

    /* JADX INFO: renamed from: d */
    public final float f122770d;

    /* JADX INFO: renamed from: e */
    public final boolean f122771e;

    public ki21(float f, float f2, float f3, float f4, boolean z) {
        this.f122767a = f;
        this.f122768b = f2;
        this.f122769c = f3;
        this.f122770d = f4;
        this.f122771e = z;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        qi21 qi21Var = new qi21();
        qi21Var.f188910M0 = this.f122767a;
        qi21Var.f188911N0 = this.f122768b;
        qi21Var.f188912O0 = this.f122769c;
        qi21Var.f188913P0 = this.f122770d;
        qi21Var.f188914Q0 = this.f122771e;
        return qi21Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        qi21 qi21Var = (qi21) exh0Var;
        qi21Var.f188910M0 = this.f122767a;
        qi21Var.f188911N0 = this.f122768b;
        qi21Var.f188912O0 = this.f122769c;
        qi21Var.f188913P0 = this.f122770d;
        qi21Var.f188914Q0 = this.f122771e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki21)) {
            return false;
        }
        ki21 ki21Var = (ki21) obj;
        return ybs.m93301b(this.f122767a, ki21Var.f122767a) && ybs.m93301b(this.f122768b, ki21Var.f122768b) && ybs.m93301b(this.f122769c, ki21Var.f122769c) && ybs.m93301b(this.f122770d, ki21Var.f122770d) && this.f122771e == ki21Var.f122771e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122771e) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f122767a) * 31, 31, this.f122768b), 31, this.f122769c), 31, this.f122770d);
    }

    public /* synthetic */ ki21(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }
}
