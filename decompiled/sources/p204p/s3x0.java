package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s3x0 {

    /* JADX INFO: renamed from: a */
    public final int f205361a;

    /* JADX INFO: renamed from: b */
    public final long f205362b;

    public s3x0(int i, long j) {
        this.f205361a = i;
        this.f205362b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3x0)) {
            return false;
        }
        s3x0 s3x0Var = (s3x0) obj;
        return this.f205361a == s3x0Var.f205361a && this.f205362b == s3x0Var.f205362b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205362b) + (Integer.hashCode(this.f205361a) * 31);
    }
}
