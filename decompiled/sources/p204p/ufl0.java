package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ufl0 {

    /* JADX INFO: renamed from: a */
    public final Object f229836a;

    /* JADX INFO: renamed from: b */
    public final Integer f229837b;

    /* JADX INFO: renamed from: c */
    public final Integer f229838c;

    public ufl0(Set set, Integer num, Integer num2) {
        this.f229836a = set;
        this.f229837b = num;
        this.f229838c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufl0)) {
            return false;
        }
        ufl0 ufl0Var = (ufl0) obj;
        return this.f229836a.equals(ufl0Var.f229836a) && wj50.m88271j(this.f229837b, ufl0Var.f229837b) && wj50.m88271j(this.f229838c, ufl0Var.f229838c);
    }

    public final int hashCode() {
        int iHashCode = this.f229836a.hashCode() * 31;
        Integer num = this.f229837b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f229838c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
