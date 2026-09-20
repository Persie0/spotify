package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b3y {

    /* JADX INFO: renamed from: a */
    public final ebf0 f23147a;

    public b3y(ebf0 ebf0Var) {
        this.f23147a = ebf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3y) && wj50.m88271j(this.f23147a, ((b3y) obj).f23147a);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f23147a;
        if (ebf0Var == null) {
            return 0;
        }
        return ebf0Var.f57921a.hashCode();
    }
}
