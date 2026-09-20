package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tel0 {

    /* JADX INFO: renamed from: a */
    public final l4x f219739a;

    /* JADX INFO: renamed from: b */
    public final Boolean f219740b;

    public tel0(l4x l4xVar, Boolean bool) {
        this.f219739a = l4xVar;
        this.f219740b = bool;
    }

    /* JADX INFO: renamed from: a */
    public static tel0 m80536a(tel0 tel0Var, l4x l4xVar, Boolean bool, int i) {
        if ((i & 1) != 0) {
            l4xVar = tel0Var.f219739a;
        }
        if ((i & 2) != 0) {
            bool = tel0Var.f219740b;
        }
        tel0Var.getClass();
        return new tel0(l4xVar, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tel0)) {
            return false;
        }
        tel0 tel0Var = (tel0) obj;
        return wj50.m88271j(this.f219739a, tel0Var.f219739a) && wj50.m88271j(this.f219740b, tel0Var.f219740b);
    }

    public final int hashCode() {
        l4x l4xVar = this.f219739a;
        int iHashCode = (l4xVar == null ? 0 : l4xVar.hashCode()) * 31;
        Boolean bool = this.f219740b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
