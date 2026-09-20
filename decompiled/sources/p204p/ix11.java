package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ix11 {

    /* JADX INFO: renamed from: a */
    public final List f106562a;

    /* JADX INFO: renamed from: b */
    public final boolean f106563b;

    /* JADX INFO: renamed from: c */
    public final boolean f106564c;

    /* JADX INFO: renamed from: d */
    public final boolean f106565d;

    /* JADX INFO: renamed from: e */
    public final xhy0 f106566e;

    public ix11(List list, boolean z, boolean z2, boolean z3, xhy0 xhy0Var) {
        this.f106562a = list;
        this.f106563b = z;
        this.f106564c = z2;
        this.f106565d = z3;
        this.f106566e = xhy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix11)) {
            return false;
        }
        ix11 ix11Var = (ix11) obj;
        return wj50.m88271j(this.f106562a, ix11Var.f106562a) && this.f106563b == ix11Var.f106563b && this.f106564c == ix11Var.f106564c && this.f106565d == ix11Var.f106565d && wj50.m88271j(this.f106566e, ix11Var.f106566e);
    }

    public final int hashCode() {
        return this.f106566e.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(this.f106562a.hashCode() * 31, 31, this.f106563b), 31, this.f106564c), 31, this.f106565d);
    }
}
