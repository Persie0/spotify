package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gan0 {

    /* JADX INFO: renamed from: a */
    public final long f78080a;

    /* JADX INFO: renamed from: b */
    public final int f78081b;

    public gan0(int i, long j) {
        this.f78080a = j;
        this.f78081b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gan0)) {
            return false;
        }
        gan0 gan0Var = (gan0) obj;
        return this.f78080a == gan0Var.f78080a && this.f78081b == gan0Var.f78081b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78081b) + (Long.hashCode(this.f78080a) * 31);
    }
}
