package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z1d0 {

    /* JADX INFO: renamed from: a */
    public final String f278290a;

    /* JADX INFO: renamed from: b */
    public final b450 f278291b;

    public z1d0(String str, b450 b450Var) {
        this.f278290a = str;
        this.f278291b = b450Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1d0)) {
            return false;
        }
        z1d0 z1d0Var = (z1d0) obj;
        return wj50.m88271j(this.f278290a, z1d0Var.f278290a) && wj50.m88271j(this.f278291b, z1d0Var.f278291b);
    }

    public final int hashCode() {
        return this.f278291b.hashCode() + (this.f278290a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f278290a + ", range=" + this.f278291b + ')';
    }
}
