package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final String f153892a;

    /* JADX INFO: renamed from: b */
    public final lc8 f153893b;

    public nh8(String str, lc8 lc8Var) {
        this.f153892a = str;
        this.f153893b = lc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nh8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nh8 nh8Var = (nh8) obj;
        return wj50.m88271j(this.f153892a, nh8Var.f153892a) && wj50.m88271j(this.f153893b, nh8Var.f153893b);
    }

    public final int hashCode() {
        return this.f153893b.hashCode() + (this.f153892a.hashCode() * 31);
    }
}
