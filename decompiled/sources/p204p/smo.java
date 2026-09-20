package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class smo extends tmo {

    /* JADX INFO: renamed from: a */
    public final jba0 f210692a;

    public smo(jba0 jba0Var) {
        this.f210692a = jba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smo) && wj50.m88271j(this.f210692a, ((smo) obj).f210692a);
    }

    public final int hashCode() {
        jba0 jba0Var = this.f210692a;
        if (jba0Var == null) {
            return 0;
        }
        return jba0Var.hashCode();
    }
}
