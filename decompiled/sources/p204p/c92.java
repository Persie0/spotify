package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c92 {

    /* JADX INFO: renamed from: a */
    public final boolean f35371a;

    /* JADX INFO: renamed from: b */
    public final int f35372b;

    public c92(boolean z, int i) {
        this.f35371a = z;
        this.f35372b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return this.f35371a == c92Var.f35371a && this.f35372b == c92Var.f35372b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35372b) + (Boolean.hashCode(this.f35371a) * 31);
    }
}
