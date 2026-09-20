package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q241 {

    /* JADX INFO: renamed from: a */
    public final r241 f184479a;

    /* JADX INFO: renamed from: b */
    public final p241 f184480b;

    public q241(r241 r241Var, p241 p241Var) {
        this.f184479a = r241Var;
        this.f184480b = p241Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q241)) {
            return false;
        }
        q241 q241Var = (q241) obj;
        return wj50.m88271j(this.f184479a, q241Var.f184479a) && wj50.m88271j(this.f184480b, q241Var.f184480b);
    }

    public final int hashCode() {
        int iHashCode = this.f184479a.hashCode() * 31;
        p241 p241Var = this.f184480b;
        return iHashCode + (p241Var == null ? 0 : p241Var.hashCode());
    }
}
