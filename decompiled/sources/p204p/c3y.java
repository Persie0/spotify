package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c3y {

    /* JADX INFO: renamed from: a */
    public final ebf0 f33779a;

    public c3y(ebf0 ebf0Var) {
        this.f33779a = ebf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3y) && wj50.m88271j(this.f33779a, ((c3y) obj).f33779a);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f33779a;
        if (ebf0Var == null) {
            return 0;
        }
        return ebf0Var.f57921a.hashCode();
    }
}
