package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class r1l0 {

    /* JADX INFO: renamed from: a */
    public final List f194884a;

    /* JADX INFO: renamed from: b */
    public final List f194885b;

    public r1l0(List list, List list2) {
        this.f194884a = list;
        this.f194885b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1l0)) {
            return false;
        }
        r1l0 r1l0Var = (r1l0) obj;
        return wj50.m88271j(this.f194884a, r1l0Var.f194884a) && wj50.m88271j(this.f194885b, r1l0Var.f194885b);
    }

    public final int hashCode() {
        return this.f194885b.hashCode() + (this.f194884a.hashCode() * 31);
    }
}
