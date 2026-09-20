package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aci implements jci {

    /* JADX INFO: renamed from: a */
    public final j2d0 f14366a;

    public aci(j2d0 j2d0Var) {
        this.f14366a = j2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aci) && wj50.m88271j(this.f14366a, ((aci) obj).f14366a);
    }

    public final int hashCode() {
        return this.f14366a.hashCode();
    }
}
