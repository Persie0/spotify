package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e5o0 {

    /* JADX INFO: renamed from: a */
    public final h5o0 f56438a;

    public e5o0(h5o0 h5o0Var) {
        this.f56438a = h5o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5o0) && wj50.m88271j(this.f56438a, ((e5o0) obj).f56438a);
    }

    public final int hashCode() {
        h5o0 h5o0Var = this.f56438a;
        if (h5o0Var == null) {
            return 0;
        }
        return h5o0Var.hashCode();
    }
}
