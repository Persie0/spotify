package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q1e0 {

    /* JADX INFO: renamed from: a */
    public final r1y f184304a;

    /* JADX INFO: renamed from: b */
    public final n1e0 f184305b;

    public q1e0(r1y r1yVar, n1e0 n1e0Var) {
        this.f184304a = r1yVar;
        this.f184305b = n1e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e0)) {
            return false;
        }
        q1e0 q1e0Var = (q1e0) obj;
        return wj50.m88271j(this.f184304a, q1e0Var.f184304a) && wj50.m88271j(this.f184305b, q1e0Var.f184305b);
    }

    public final int hashCode() {
        return this.f184305b.hashCode() + (this.f184304a.hashCode() * 31);
    }
}
