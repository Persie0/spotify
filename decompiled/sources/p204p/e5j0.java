package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e5j0 {

    /* JADX INFO: renamed from: a */
    public final s6j0 f56413a;

    /* JADX INFO: renamed from: b */
    public final s6j0 f56414b;

    /* JADX INFO: renamed from: c */
    public final b3j0 f56415c;

    /* JADX INFO: renamed from: d */
    public final List f56416d;

    /* JADX INFO: renamed from: e */
    public final List f56417e;

    /* JADX INFO: renamed from: f */
    public final String f56418f;

    /* JADX INFO: renamed from: g */
    public final Long f56419g;

    public e5j0(s6j0 s6j0Var, s6j0 s6j0Var2, b3j0 b3j0Var, List list, List list2, String str, Long l) {
        this.f56413a = s6j0Var;
        this.f56414b = s6j0Var2;
        this.f56415c = b3j0Var;
        this.f56416d = list;
        this.f56417e = list2;
        this.f56418f = str;
        this.f56419g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5j0)) {
            return false;
        }
        e5j0 e5j0Var = (e5j0) obj;
        return wj50.m88271j(this.f56413a, e5j0Var.f56413a) && wj50.m88271j(this.f56414b, e5j0Var.f56414b) && wj50.m88271j(this.f56415c, e5j0Var.f56415c) && wj50.m88271j(this.f56416d, e5j0Var.f56416d) && wj50.m88271j(this.f56417e, e5j0Var.f56417e) && wj50.m88271j(this.f56418f, e5j0Var.f56418f) && wj50.m88271j(this.f56419g, e5j0Var.f56419g);
    }

    public final int hashCode() {
        int iHashCode = this.f56413a.hashCode() * 31;
        s6j0 s6j0Var = this.f56414b;
        int iM77244c = s571.m77244c(s571.m77244c((this.f56415c.hashCode() + ((iHashCode + (s6j0Var == null ? 0 : s6j0Var.hashCode())) * 31)) * 31, 31, this.f56416d), 31, this.f56417e);
        String str = this.f56418f;
        int iHashCode2 = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f56419g;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
