package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class usk {

    /* JADX INFO: renamed from: a */
    public final gmr0 f233645a;

    public usk(gmr0 gmr0Var) {
        this.f233645a = gmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usk) && wj50.m88271j(this.f233645a, ((usk) obj).f233645a);
    }

    public final int hashCode() {
        gmr0 gmr0Var = this.f233645a;
        if (gmr0Var == null) {
            return 0;
        }
        return gmr0Var.hashCode();
    }
}
