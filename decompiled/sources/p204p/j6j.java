package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j6j {

    /* JADX INFO: renamed from: a */
    public final Object f109326a;

    /* JADX INFO: renamed from: b */
    public final int f109327b;

    /* JADX INFO: renamed from: c */
    public final sq70 f109328c;

    public j6j(Object obj, int i, sq70 sq70Var) {
        this.f109326a = obj;
        this.f109327b = i;
        this.f109328c = sq70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6j)) {
            return false;
        }
        j6j j6jVar = (j6j) obj;
        return this.f109326a.equals(j6jVar.f109326a) && this.f109327b == j6jVar.f109327b && this.f109328c.equals(j6jVar.f109328c);
    }

    public final int hashCode() {
        return this.f109328c.hashCode() + mt60.m62800g(this.f109327b, this.f109326a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f109326a + ", index=" + this.f109327b + ", reference=" + this.f109328c + ')';
    }
}
