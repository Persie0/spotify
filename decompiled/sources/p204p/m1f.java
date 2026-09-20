package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final d850 f138955a;

    public m1f(d850 d850Var) {
        this.f138955a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1f) && wj50.m88271j(this.f138955a, ((m1f) obj).f138955a);
    }

    public final int hashCode() {
        return this.f138955a.hashCode();
    }
}
