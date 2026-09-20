package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bzt0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f32580a;

    /* JADX INFO: renamed from: b */
    public final gh00 f32581b;

    public bzt0(qf40 qf40Var, gh00 gh00Var) {
        this.f32580a = qf40Var;
        this.f32581b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzt0)) {
            return false;
        }
        bzt0 bzt0Var = (bzt0) obj;
        return wj50.m88271j(this.f32580a, bzt0Var.f32580a) && wj50.m88271j(this.f32581b, bzt0Var.f32581b);
    }

    public final int hashCode() {
        return this.f32581b.hashCode() + (this.f32580a.hashCode() * 31);
    }
}
