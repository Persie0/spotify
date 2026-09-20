package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class szy0 {

    /* JADX INFO: renamed from: a */
    public final tl11 f215693a;

    /* JADX INFO: renamed from: b */
    public final q2q0 f215694b;

    /* JADX INFO: renamed from: c */
    public final boolean f215695c;

    /* JADX INFO: renamed from: d */
    public final d5x0 f215696d;

    /* JADX INFO: renamed from: e */
    public final Set f215697e;

    public szy0(tl11 tl11Var, q2q0 q2q0Var, boolean z, d5x0 d5x0Var, Set set) {
        this.f215693a = tl11Var;
        this.f215694b = q2q0Var;
        this.f215695c = z;
        this.f215696d = d5x0Var;
        this.f215697e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szy0)) {
            return false;
        }
        szy0 szy0Var = (szy0) obj;
        return wj50.m88271j(this.f215693a, szy0Var.f215693a) && wj50.m88271j(this.f215694b, szy0Var.f215694b) && this.f215695c == szy0Var.f215695c && wj50.m88271j(this.f215696d, szy0Var.f215696d) && wj50.m88271j(this.f215697e, szy0Var.f215697e);
    }

    public final int hashCode() {
        return this.f215697e.hashCode() + ((this.f215696d.hashCode() + s571.m77245d((this.f215694b.hashCode() + (this.f215693a.hashCode() * 31)) * 31, 31, this.f215695c)) * 31);
    }
}
