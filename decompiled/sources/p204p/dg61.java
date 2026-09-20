package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dg61 {

    /* JADX INFO: renamed from: a */
    public final sg40 f48744a;

    public dg61(sg40 sg40Var) {
        this.f48744a = sg40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg61) && wj50.m88271j(this.f48744a, ((dg61) obj).f48744a);
    }

    public final int hashCode() {
        sg40 sg40Var = this.f48744a;
        if (sg40Var == null) {
            return 0;
        }
        return sg40Var.hashCode();
    }
}
