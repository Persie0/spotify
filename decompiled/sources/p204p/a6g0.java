package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a6g0 {

    /* JADX INFO: renamed from: a */
    public final int f12796a;

    /* JADX INFO: renamed from: b */
    public final v6g0 f12797b;

    public a6g0(int i, v6g0 v6g0Var) {
        this.f12796a = i;
        this.f12797b = v6g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6g0)) {
            return false;
        }
        a6g0 a6g0Var = (a6g0) obj;
        return this.f12796a == a6g0Var.f12796a && wj50.m88271j(this.f12797b, a6g0Var.f12797b);
    }

    public final int hashCode() {
        return this.f12797b.hashCode() + (Integer.hashCode(this.f12796a) * 31);
    }
}
