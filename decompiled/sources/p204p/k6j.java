package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k6j {

    /* JADX INFO: renamed from: a */
    public final Object f119762a;

    /* JADX INFO: renamed from: b */
    public final int f119763b;

    /* JADX INFO: renamed from: c */
    public final sq70 f119764c;

    public k6j(Object obj, int i, sq70 sq70Var) {
        this.f119762a = obj;
        this.f119763b = i;
        this.f119764c = sq70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6j)) {
            return false;
        }
        k6j k6jVar = (k6j) obj;
        return wj50.m88271j(this.f119762a, k6jVar.f119762a) && this.f119763b == k6jVar.f119763b && wj50.m88271j(this.f119764c, k6jVar.f119764c);
    }

    public final int hashCode() {
        return this.f119764c.hashCode() + mt60.m62800g(this.f119763b, this.f119762a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f119762a + ", index=" + this.f119763b + ", reference=" + this.f119764c + ')';
    }
}
