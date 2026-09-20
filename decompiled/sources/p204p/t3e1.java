package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t3e1 {

    /* JADX INFO: renamed from: a */
    public final String f216758a;

    /* JADX INFO: renamed from: b */
    public final z3l0 f216759b;

    public t3e1(String str, z3l0 z3l0Var) {
        this.f216758a = str;
        this.f216759b = z3l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3e1)) {
            return false;
        }
        t3e1 t3e1Var = (t3e1) obj;
        return wj50.m88271j(this.f216758a, t3e1Var.f216758a) && wj50.m88271j(this.f216759b, t3e1Var.f216759b);
    }

    public final int hashCode() {
        return this.f216759b.hashCode() + (this.f216758a.hashCode() * 31);
    }
}
