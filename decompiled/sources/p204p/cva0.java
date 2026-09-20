package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cva0 {

    /* JADX INFO: renamed from: a */
    public final w0b0 f42343a;

    /* JADX INFO: renamed from: b */
    public final boolean f42344b;

    public cva0(w0b0 w0b0Var, boolean z) {
        this.f42343a = w0b0Var;
        this.f42344b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cva0)) {
            return false;
        }
        cva0 cva0Var = (cva0) obj;
        return wj50.m88271j(this.f42343a, cva0Var.f42343a) && this.f42344b == cva0Var.f42344b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42344b) + (this.f42343a.hashCode() * 31);
    }
}
