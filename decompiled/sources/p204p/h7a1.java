package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class h7a1 {
    public static final g7a1 Companion = new g7a1();

    /* JADX INFO: renamed from: a */
    public final uj0 f88396a;

    public /* synthetic */ h7a1(int i, uj0 uj0Var) {
        if (1 == (i & 1)) {
            this.f88396a = uj0Var;
        } else {
            edo.m38617p(i, 1, f7a1.f66634a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7a1) && wj50.m88271j(this.f88396a, ((h7a1) obj).f88396a);
    }

    public final int hashCode() {
        return this.f88396a.hashCode();
    }

    public h7a1(uj0 uj0Var) {
        this.f88396a = uj0Var;
    }
}
