package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r80 {

    /* JADX INFO: renamed from: a */
    public final a90 f196685a;

    /* JADX INFO: renamed from: b */
    public final int f196686b;

    public r80(a90 a90Var, int i) {
        this.f196685a = a90Var;
        this.f196686b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return wj50.m88271j(this.f196685a, r80Var.f196685a) && this.f196686b == r80Var.f196686b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f196686b) + (this.f196685a.hashCode() * 31);
    }
}
