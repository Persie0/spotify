package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fgu0 {

    /* JADX INFO: renamed from: a */
    public final String f69401a;

    /* JADX INFO: renamed from: b */
    public final int f69402b;

    /* JADX INFO: renamed from: c */
    public final List f69403c;

    /* JADX INFO: renamed from: d */
    public final boolean f69404d;

    /* JADX INFO: renamed from: e */
    public final gh00 f69405e;

    public fgu0(String str, int i, List list, boolean z, gh00 gh00Var) {
        this.f69401a = str;
        this.f69402b = i;
        this.f69403c = list;
        this.f69404d = z;
        this.f69405e = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m41615a() {
        return this.f69401a;
    }

    /* JADX INFO: renamed from: b */
    public final List m41616b() {
        return this.f69403c;
    }

    /* JADX INFO: renamed from: c */
    public final int m41617c() {
        return this.f69402b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m41618d() {
        return this.f69404d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgu0)) {
            return false;
        }
        fgu0 fgu0Var = (fgu0) obj;
        return wj50.m88271j(this.f69401a, fgu0Var.f69401a) && this.f69402b == fgu0Var.f69402b && wj50.m88271j(this.f69403c, fgu0Var.f69403c) && this.f69404d == fgu0Var.f69404d && wj50.m88271j(this.f69405e, fgu0Var.f69405e);
    }

    public final int hashCode() {
        return this.f69405e.hashCode() + s571.m77245d(s571.m77244c(f710.m40938f(this.f69402b, this.f69401a.hashCode() * 31, 31), 31, this.f69403c), 31, this.f69404d);
    }
}
