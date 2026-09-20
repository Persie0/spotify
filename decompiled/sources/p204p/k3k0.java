package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class k3k0 extends t3k0 {

    /* JADX INFO: renamed from: a */
    public final w90 f118926a;

    public k3k0(w90 w90Var) {
        this.f118926a = w90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3k0) && wj50.m88271j(this.f118926a, ((k3k0) obj).f118926a);
    }

    public final int hashCode() {
        w90 w90Var = this.f118926a;
        if (w90Var == null) {
            return 0;
        }
        return w90Var.hashCode();
    }
}
