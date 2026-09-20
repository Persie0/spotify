package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class to31 {

    /* JADX INFO: renamed from: a */
    public final Long f222164a;

    /* JADX INFO: renamed from: b */
    public final List f222165b;

    public to31(Long l, List list) {
        this.f222164a = l;
        this.f222165b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to31)) {
            return false;
        }
        to31 to31Var = (to31) obj;
        return wj50.m88271j(this.f222164a, to31Var.f222164a) && wj50.m88271j(this.f222165b, to31Var.f222165b);
    }

    public final int hashCode() {
        Long l = this.f222164a;
        return this.f222165b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
