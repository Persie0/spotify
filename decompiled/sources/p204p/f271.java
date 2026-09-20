package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f271 {

    /* JADX INFO: renamed from: a */
    public final int f65125a;

    /* JADX INFO: renamed from: b */
    public final int f65126b;

    public f271(int i, int i2) {
        this.f65125a = i;
        this.f65126b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f271)) {
            return false;
        }
        f271 f271Var = (f271) obj;
        return this.f65125a == f271Var.f65125a && this.f65126b == f271Var.f65126b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65126b) + (Integer.hashCode(this.f65125a) * 31);
    }
}
