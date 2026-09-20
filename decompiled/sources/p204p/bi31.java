package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bi31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final String f27326a;

    /* JADX INFO: renamed from: b */
    public final o2x0 f27327b;

    public bi31(String str, o2x0 o2x0Var) {
        this.f27326a = str;
        this.f27327b = o2x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi31)) {
            return false;
        }
        bi31 bi31Var = (bi31) obj;
        return wj50.m88271j(this.f27326a, bi31Var.f27326a) && wj50.m88271j(this.f27327b, bi31Var.f27327b);
    }

    public final int hashCode() {
        int iHashCode = this.f27326a.hashCode() * 31;
        o2x0 o2x0Var = this.f27327b;
        return iHashCode + (o2x0Var == null ? 0 : o2x0Var.hashCode());
    }
}
