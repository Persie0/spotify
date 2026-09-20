package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class acv0 {

    /* JADX INFO: renamed from: a */
    public final List f14467a;

    /* JADX INFO: renamed from: b */
    public final sr4 f14468b;

    public acv0(List list, sr4 sr4Var) {
        this.f14467a = list;
        this.f14468b = sr4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acv0)) {
            return false;
        }
        acv0 acv0Var = (acv0) obj;
        return wj50.m88271j(this.f14467a, acv0Var.f14467a) && wj50.m88271j(this.f14468b, acv0Var.f14468b);
    }

    public final int hashCode() {
        int iHashCode = this.f14467a.hashCode() * 31;
        sr4 sr4Var = this.f14468b;
        return iHashCode + (sr4Var == null ? 0 : sr4Var.hashCode());
    }
}
