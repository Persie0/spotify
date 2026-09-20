package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nbc0 {

    /* JADX INFO: renamed from: a */
    public final List f152239a;

    /* JADX INFO: renamed from: b */
    public final Object f152240b;

    /* JADX INFO: renamed from: c */
    public final Object f152241c;

    /* JADX INFO: renamed from: d */
    public final List f152242d;

    /* JADX INFO: renamed from: e */
    public final int f152243e;

    /* JADX INFO: renamed from: f */
    public final Long f152244f;

    /* JADX INFO: renamed from: g */
    public final Long f152245g;

    public nbc0(List list, List list2, List list3, List list4, int i, Long l, Long l2) {
        this.f152239a = list;
        this.f152240b = list2;
        this.f152241c = list3;
        this.f152242d = list4;
        this.f152243e = i;
        this.f152244f = l;
        this.f152245g = l2;
    }

    /* JADX INFO: renamed from: a */
    public final List m64073a() {
        return this.f152242d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final List m64074b() {
        return this.f152240b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbc0)) {
            return false;
        }
        nbc0 nbc0Var = (nbc0) obj;
        return wj50.m88271j(this.f152239a, nbc0Var.f152239a) && this.f152240b.equals(nbc0Var.f152240b) && this.f152241c.equals(nbc0Var.f152241c) && wj50.m88271j(this.f152242d, nbc0Var.f152242d) && this.f152243e == nbc0Var.f152243e && wj50.m88271j(this.f152244f, nbc0Var.f152244f) && wj50.m88271j(this.f152245g, nbc0Var.f152245g);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(dq60.m36604d(dq60.m36604d(this.f152239a.hashCode() * 31, 31, this.f152240b), 31, this.f152241c), 31, this.f152242d);
        int i = this.f152243e;
        int iM38547C = (iM77244c + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        Long l = this.f152244f;
        int iHashCode = (iM38547C + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f152245g;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
