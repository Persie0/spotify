package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cmp0 {

    /* JADX INFO: renamed from: a */
    public final String f39756a;

    /* JADX INFO: renamed from: b */
    public final String f39757b;

    public cmp0(String str, String str2) {
        this.f39756a = str;
        this.f39757b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmp0)) {
            return false;
        }
        cmp0 cmp0Var = (cmp0) obj;
        return wj50.m88271j(this.f39756a, cmp0Var.f39756a) && wj50.m88271j(this.f39757b, cmp0Var.f39757b);
    }

    public final int hashCode() {
        return this.f39757b.hashCode() + (this.f39756a.hashCode() * 31);
    }
}
