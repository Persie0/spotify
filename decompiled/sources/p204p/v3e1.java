package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v3e1 {

    /* JADX INFO: renamed from: a */
    public final t3e1 f236842a;

    /* JADX INFO: renamed from: b */
    public final boolean f236843b;

    public v3e1(t3e1 t3e1Var, boolean z) {
        this.f236842a = t3e1Var;
        this.f236843b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e1)) {
            return false;
        }
        v3e1 v3e1Var = (v3e1) obj;
        return wj50.m88271j(this.f236842a, v3e1Var.f236842a) && this.f236843b == v3e1Var.f236843b;
    }

    public final int hashCode() {
        t3e1 t3e1Var = this.f236842a;
        return Boolean.hashCode(this.f236843b) + ((t3e1Var == null ? 0 : t3e1Var.hashCode()) * 31);
    }
}
