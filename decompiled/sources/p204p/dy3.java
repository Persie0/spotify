package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dy3 {

    /* JADX INFO: renamed from: a */
    public final cy3 f54158a;

    /* JADX INFO: renamed from: b */
    public final int f54159b;

    public dy3(cy3 cy3Var, int i) {
        this.f54158a = cy3Var;
        this.f54159b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy3)) {
            return false;
        }
        dy3 dy3Var = (dy3) obj;
        return this.f54158a == dy3Var.f54158a && this.f54159b == dy3Var.f54159b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54159b) + (this.f54158a.hashCode() * 31);
    }
}
