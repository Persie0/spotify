package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ci60 {

    /* JADX INFO: renamed from: a */
    public final cx50 f38235a;

    /* JADX INFO: renamed from: b */
    public final wj60 f38236b;

    /* JADX INFO: renamed from: c */
    public final boolean f38237c;

    /* JADX INFO: renamed from: d */
    public final String f38238d;

    /* JADX INFO: renamed from: e */
    public final wwu f38239e;

    /* JADX INFO: renamed from: f */
    public final boolean f38240f;

    /* JADX INFO: renamed from: g */
    public final Set f38241g;

    public ci60(cx50 cx50Var, wj60 wj60Var, boolean z, String str, wwu wwuVar, boolean z2, Set set) {
        this.f38235a = cx50Var;
        this.f38236b = wj60Var;
        this.f38237c = z;
        this.f38238d = str;
        this.f38239e = wwuVar;
        this.f38240f = z2;
        this.f38241g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci60)) {
            return false;
        }
        ci60 ci60Var = (ci60) obj;
        return wj50.m88271j(this.f38235a, ci60Var.f38235a) && this.f38236b == ci60Var.f38236b && this.f38237c == ci60Var.f38237c && wj50.m88271j(this.f38238d, ci60Var.f38238d) && wj50.m88271j(this.f38239e, ci60Var.f38239e) && this.f38240f == ci60Var.f38240f && wj50.m88271j(this.f38241g, ci60Var.f38241g);
    }

    public final int hashCode() {
        return this.f38241g.hashCode() + s571.m77245d((this.f38239e.hashCode() + s571.m77243b(s571.m77245d((this.f38236b.hashCode() + (this.f38235a.hashCode() * 31)) * 31, 31, this.f38237c), 31, this.f38238d)) * 31, 31, this.f38240f);
    }
}
