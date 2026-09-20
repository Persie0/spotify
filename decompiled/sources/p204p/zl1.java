package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zl1 {

    /* JADX INFO: renamed from: a */
    public final is31 f283887a;

    /* JADX INFO: renamed from: b */
    public final List f283888b;

    /* JADX INFO: renamed from: c */
    public final List f283889c;

    /* JADX INFO: renamed from: d */
    public final boolean f283890d;

    /* JADX INFO: renamed from: e */
    public final Set f283891e;

    public zl1(is31 is31Var, List list, List list2, boolean z, Set set) {
        this.f283887a = is31Var;
        this.f283888b = list;
        this.f283889c = list2;
        this.f283890d = z;
        this.f283891e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.f283887a == zl1Var.f283887a && wj50.m88271j(this.f283888b, zl1Var.f283888b) && wj50.m88271j(this.f283889c, zl1Var.f283889c) && this.f283890d == zl1Var.f283890d && wj50.m88271j(this.f283891e, zl1Var.f283891e);
    }

    public final int hashCode() {
        return this.f283891e.hashCode() + s571.m77245d(s571.m77244c(s571.m77244c(this.f283887a.hashCode() * 31, 31, this.f283888b), 31, this.f283889c), 31, this.f283890d);
    }
}
