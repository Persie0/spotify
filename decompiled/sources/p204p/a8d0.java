package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a8d0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13256a;

    /* JADX INFO: renamed from: b */
    public final Map f13257b;

    /* JADX INFO: renamed from: c */
    public final boolean f13258c;

    /* JADX INFO: renamed from: d */
    public final boolean f13259d;

    /* JADX INFO: renamed from: e */
    public final boolean f13260e;

    /* JADX INFO: renamed from: f */
    public final rhj f13261f;

    /* JADX INFO: renamed from: g */
    public final boolean f13262g;

    /* JADX INFO: renamed from: h */
    public final boolean f13263h;

    public a8d0(boolean z, Map map, boolean z2, boolean z3, boolean z4, rhj rhjVar, boolean z5, boolean z6) {
        this.f13256a = z;
        this.f13257b = map;
        this.f13258c = z2;
        this.f13259d = z3;
        this.f13260e = z4;
        this.f13261f = rhjVar;
        this.f13262g = z5;
        this.f13263h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d0)) {
            return false;
        }
        a8d0 a8d0Var = (a8d0) obj;
        return this.f13256a == a8d0Var.f13256a && wj50.m88271j(this.f13257b, a8d0Var.f13257b) && this.f13258c == a8d0Var.f13258c && this.f13259d == a8d0Var.f13259d && this.f13260e == a8d0Var.f13260e && this.f13261f == a8d0Var.f13261f && this.f13262g == a8d0Var.f13262g && this.f13263h == a8d0Var.f13263h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13263h) + s571.m77245d((this.f13261f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(edb.m38557f(Boolean.hashCode(this.f13256a) * 31, 31, this.f13257b), 31, this.f13258c), 31, this.f13259d), 31, this.f13260e)) * 31, 31, this.f13262g);
    }
}
