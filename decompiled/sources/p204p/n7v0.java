package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class n7v0 extends q7v0 {

    /* JADX INFO: renamed from: a */
    public final un20 f151226a;

    /* JADX INFO: renamed from: b */
    public final List f151227b;

    /* JADX INFO: renamed from: c */
    public final boolean f151228c;

    /* JADX INFO: renamed from: d */
    public final String f151229d;

    /* JADX INFO: renamed from: e */
    public final boolean f151230e;

    public n7v0(un20 un20Var, List list, boolean z, String str, boolean z2) {
        this.f151226a = un20Var;
        this.f151227b = list;
        this.f151228c = z;
        this.f151229d = str;
        this.f151230e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7v0)) {
            return false;
        }
        n7v0 n7v0Var = (n7v0) obj;
        return wj50.m88271j(this.f151226a, n7v0Var.f151226a) && wj50.m88271j(this.f151227b, n7v0Var.f151227b) && this.f151228c == n7v0Var.f151228c && wj50.m88271j(this.f151229d, n7v0Var.f151229d) && this.f151230e == n7v0Var.f151230e;
    }

    public final int hashCode() {
        un20 un20Var = this.f151226a;
        return Boolean.hashCode(this.f151230e) + s571.m77243b(s571.m77245d(s571.m77244c((un20Var == null ? 0 : un20Var.hashCode()) * 31, 31, this.f151227b), 31, this.f151228c), 31, this.f151229d);
    }
}
