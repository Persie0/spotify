package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z420 {

    /* JADX INFO: renamed from: a */
    public final String f279098a;

    /* JADX INFO: renamed from: b */
    public final t420 f279099b;

    public z420(String str, t420 t420Var) {
        this.f279098a = str;
        this.f279099b = t420Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z420)) {
            return false;
        }
        z420 z420Var = (z420) obj;
        return wj50.m88271j(this.f279098a, z420Var.f279098a) && wj50.m88271j(this.f279099b, z420Var.f279099b);
    }

    public final int hashCode() {
        int iHashCode = this.f279098a.hashCode() * 31;
        t420 t420Var = this.f279099b;
        return iHashCode + (t420Var == null ? 0 : t420Var.hashCode());
    }
}
