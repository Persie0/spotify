package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qmo extends tmo {

    /* JADX INFO: renamed from: a */
    public final jba0 f190362a;

    public qmo(jba0 jba0Var) {
        this.f190362a = jba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmo) && wj50.m88271j(this.f190362a, ((qmo) obj).f190362a);
    }

    public final int hashCode() {
        jba0 jba0Var = this.f190362a;
        if (jba0Var == null) {
            return 0;
        }
        return jba0Var.hashCode();
    }
}
