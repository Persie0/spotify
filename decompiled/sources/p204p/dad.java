package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dad implements lad {

    /* JADX INFO: renamed from: a */
    public final ocl0 f47022a;

    public dad(ocl0 ocl0Var) {
        this.f47022a = ocl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dad) && wj50.m88271j(this.f47022a, ((dad) obj).f47022a);
    }

    public final int hashCode() {
        return this.f47022a.hashCode();
    }
}
