package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e4b0 {

    /* JADX INFO: renamed from: a */
    public final b450 f56041a;

    /* JADX INFO: renamed from: b */
    public final d4b0 f56042b;

    public e4b0(b450 b450Var, d4b0 d4b0Var) {
        this.f56041a = b450Var;
        this.f56042b = d4b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4b0)) {
            return false;
        }
        e4b0 e4b0Var = (e4b0) obj;
        return wj50.m88271j(this.f56041a, e4b0Var.f56041a) && wj50.m88271j(this.f56042b, e4b0Var.f56042b);
    }

    public final int hashCode() {
        return this.f56042b.hashCode() + (this.f56041a.hashCode() * 31);
    }
}
