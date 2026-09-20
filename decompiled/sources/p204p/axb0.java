package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class axb0 extends cxb0 {

    /* JADX INFO: renamed from: a */
    public final uek0 f20833a;

    /* JADX INFO: renamed from: b */
    public final boolean f20834b;

    public axb0(uek0 uek0Var, boolean z) {
        this.f20833a = uek0Var;
        this.f20834b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axb0)) {
            return false;
        }
        axb0 axb0Var = (axb0) obj;
        return this.f20833a == axb0Var.f20833a && this.f20834b == axb0Var.f20834b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20834b) + (this.f20833a.hashCode() * 31);
    }
}
