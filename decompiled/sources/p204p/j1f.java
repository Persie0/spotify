package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final d850 f107746a;

    public j1f(d850 d850Var) {
        this.f107746a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1f) && wj50.m88271j(this.f107746a, ((j1f) obj).f107746a);
    }

    public final int hashCode() {
        return this.f107746a.hashCode();
    }
}
