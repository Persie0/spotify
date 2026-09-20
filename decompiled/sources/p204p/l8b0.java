package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/l8b0;", "Lp/ixh0;", "Lp/m8b0;", "lottie-compose_release"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public final /* data */ class l8b0 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final int f130834a;

    /* JADX INFO: renamed from: b */
    public final int f130835b;

    public l8b0(int i, int i2) {
        this.f130834a = i;
        this.f130835b = i2;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        m8b0 m8b0Var = new m8b0();
        m8b0Var.f141002M0 = this.f130834a;
        m8b0Var.f141003N0 = this.f130835b;
        return m8b0Var;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        m8b0 m8b0Var = (m8b0) exh0Var;
        m8b0Var.f141002M0 = this.f130834a;
        m8b0Var.f141003N0 = this.f130835b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8b0)) {
            return false;
        }
        l8b0 l8b0Var = (l8b0) obj;
        return this.f130834a == l8b0Var.f130834a && this.f130835b == l8b0Var.f130835b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130835b) + (Integer.hashCode(this.f130834a) * 31);
    }

    public final String toString() {
        return edb.m38560i(this.f130834a, this.f130835b, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
