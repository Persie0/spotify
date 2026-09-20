package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a30 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f11766a;

    public a30(ebf0 ebf0Var) {
        this.f11766a = ebf0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ebf0 m24566a() {
        return this.f11766a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a30) && wj50.m88271j(this.f11766a, ((a30) obj).f11766a);
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f11766a;
        if (ebf0Var == null) {
            return 0;
        }
        return ebf0Var.f57921a.hashCode();
    }
}
