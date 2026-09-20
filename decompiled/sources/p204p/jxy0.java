package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class jxy0 {

    /* JADX INFO: renamed from: a */
    public final int f117246a;

    /* JADX INFO: renamed from: b */
    public final List f117247b;

    /* JADX INFO: renamed from: c */
    public final int f117248c;

    /* JADX INFO: renamed from: d */
    public final boolean f117249d;

    /* JADX INFO: renamed from: e */
    public final w2z0 f117250e;

    public jxy0(int i, List list, int i2, boolean z, w2z0 w2z0Var) {
        this.f117246a = i;
        this.f117247b = list;
        this.f117248c = i2;
        this.f117249d = z;
        this.f117250e = w2z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxy0)) {
            return false;
        }
        jxy0 jxy0Var = (jxy0) obj;
        return this.f117246a == jxy0Var.f117246a && wj50.m88271j(this.f117247b, jxy0Var.f117247b) && this.f117248c == jxy0Var.f117248c && this.f117249d == jxy0Var.f117249d && wj50.m88271j(this.f117250e, jxy0Var.f117250e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f117248c, s571.m77244c(Integer.hashCode(this.f117246a) * 31, 31, this.f117247b), 31), 31, this.f117249d);
        w2z0 w2z0Var = this.f117250e;
        return iM77245d + (w2z0Var == null ? 0 : Integer.hashCode(w2z0Var.f247446a));
    }
}
