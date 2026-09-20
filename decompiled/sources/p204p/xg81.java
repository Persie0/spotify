package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xg81 implements yg81 {

    /* JADX INFO: renamed from: a */
    public final boolean f261240a;

    /* JADX INFO: renamed from: b */
    public final String f261241b;

    public xg81(boolean z, String str) {
        this.f261240a = z;
        this.f261241b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg81)) {
            return false;
        }
        xg81 xg81Var = (xg81) obj;
        return this.f261240a == xg81Var.f261240a && wj50.m88271j(this.f261241b, xg81Var.f261241b);
    }

    public final int hashCode() {
        return this.f261241b.hashCode() + (Boolean.hashCode(this.f261240a) * 31);
    }
}
