package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yr21 implements as21 {

    /* JADX INFO: renamed from: a */
    public final List f275371a;

    /* JADX INFO: renamed from: b */
    public final List f275372b;

    /* JADX INFO: renamed from: c */
    public final b450 f275373c;

    public yr21(List list, List list2, b450 b450Var) {
        this.f275371a = list;
        this.f275372b = list2;
        this.f275373c = b450Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m94404a() {
        return this.f275371a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr21)) {
            return false;
        }
        yr21 yr21Var = (yr21) obj;
        return wj50.m88271j(this.f275371a, yr21Var.f275371a) && wj50.m88271j(this.f275372b, yr21Var.f275372b) && wj50.m88271j(this.f275373c, yr21Var.f275373c);
    }

    public final int hashCode() {
        return this.f275373c.hashCode() + s571.m77244c(this.f275371a.hashCode() * 31, 31, this.f275372b);
    }
}
