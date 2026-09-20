package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v7t0 implements x7t0 {

    /* JADX INFO: renamed from: a */
    public final int f238312a;

    /* JADX INFO: renamed from: b */
    public final int f238313b;

    public v7t0(int i, int i2) {
        this.f238312a = i;
        this.f238313b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7t0)) {
            return false;
        }
        v7t0 v7t0Var = (v7t0) obj;
        return this.f238312a == v7t0Var.f238312a && this.f238313b == v7t0Var.f238313b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f238313b) + (Integer.hashCode(this.f238312a) * 31);
    }
}
