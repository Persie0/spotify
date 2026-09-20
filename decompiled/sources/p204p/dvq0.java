package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final d850 f53511a;

    public dvq0(d850 d850Var) {
        this.f53511a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvq0) && wj50.m88271j(this.f53511a, ((dvq0) obj).f53511a);
    }

    public final int hashCode() {
        d850 d850Var = this.f53511a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
