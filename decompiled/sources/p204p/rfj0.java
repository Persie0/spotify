package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rfj0 {

    /* JADX INFO: renamed from: a */
    public final r4m0 f198664a;

    /* JADX INFO: renamed from: b */
    public final obm0 f198665b;

    public rfj0(r4m0 r4m0Var, obm0 obm0Var) {
        this.f198664a = r4m0Var;
        this.f198665b = obm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfj0)) {
            return false;
        }
        rfj0 rfj0Var = (rfj0) obj;
        return wj50.m88271j(this.f198664a, rfj0Var.f198664a) && wj50.m88271j(this.f198665b, rfj0Var.f198665b);
    }

    public final int hashCode() {
        return this.f198665b.hashCode() + (this.f198664a.hashCode() * 31);
    }
}
