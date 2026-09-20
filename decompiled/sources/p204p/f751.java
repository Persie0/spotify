package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f751 {

    /* JADX INFO: renamed from: a */
    public final String f66564a;

    /* JADX INFO: renamed from: b */
    public final int f66565b;

    public f751(String str, int i) {
        this.f66564a = str;
        this.f66565b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f751)) {
            return false;
        }
        f751 f751Var = (f751) obj;
        return wj50.m88271j(this.f66564a, f751Var.f66564a) && this.f66565b == f751Var.f66565b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f66565b) + (this.f66564a.hashCode() * 31);
    }
}
