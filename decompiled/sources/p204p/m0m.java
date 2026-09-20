package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m0m {

    /* JADX INFO: renamed from: a */
    public final c3e1 f138699a;

    /* JADX INFO: renamed from: b */
    public final int f138700b;

    public m0m(c3e1 c3e1Var, int i) {
        this.f138699a = c3e1Var;
        this.f138700b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0m)) {
            return false;
        }
        m0m m0mVar = (m0m) obj;
        return wj50.m88271j(this.f138699a, m0mVar.f138699a) && this.f138700b == m0mVar.f138700b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f138700b) + (this.f138699a.hashCode() * 31);
    }
}
