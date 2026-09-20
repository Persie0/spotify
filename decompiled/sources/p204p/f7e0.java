package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f7e0 {

    /* JADX INFO: renamed from: a */
    public final r1y f66665a;

    /* JADX INFO: renamed from: b */
    public final v6e0 f66666b;

    public f7e0(r1y r1yVar, v6e0 v6e0Var) {
        this.f66665a = r1yVar;
        this.f66666b = v6e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7e0)) {
            return false;
        }
        f7e0 f7e0Var = (f7e0) obj;
        return wj50.m88271j(this.f66665a, f7e0Var.f66665a) && wj50.m88271j(this.f66666b, f7e0Var.f66666b);
    }

    public final int hashCode() {
        return this.f66666b.hashCode() + (this.f66665a.hashCode() * 31);
    }
}
