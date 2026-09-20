package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wr20 {

    /* JADX INFO: renamed from: a */
    public final String f254247a;

    /* JADX INFO: renamed from: b */
    public final ur20 f254248b;

    public wr20(String str, ur20 ur20Var) {
        this.f254247a = str;
        this.f254248b = ur20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr20)) {
            return false;
        }
        wr20 wr20Var = (wr20) obj;
        return wj50.m88271j(this.f254247a, wr20Var.f254247a) && this.f254248b == wr20Var.f254248b;
    }

    public final int hashCode() {
        int iHashCode = this.f254247a.hashCode() * 31;
        ur20 ur20Var = this.f254248b;
        return iHashCode + (ur20Var == null ? 0 : ur20Var.hashCode());
    }
}
