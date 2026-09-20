package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hhm0 {

    /* JADX INFO: renamed from: a */
    public final ghm0 f91416a;

    /* JADX INFO: renamed from: b */
    public final gh00 f91417b;

    public hhm0(ghm0 ghm0Var, gh00 gh00Var) {
        this.f91416a = ghm0Var;
        this.f91417b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhm0)) {
            return false;
        }
        hhm0 hhm0Var = (hhm0) obj;
        return wj50.m88271j(this.f91416a, hhm0Var.f91416a) && wj50.m88271j(this.f91417b, hhm0Var.f91417b);
    }

    public final int hashCode() {
        return this.f91417b.hashCode() + (this.f91416a.hashCode() * 31);
    }
}
