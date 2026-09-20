package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final String f255749a;

    /* JADX INFO: renamed from: b */
    public final n601 f255750b;

    public wwc1(String str, n601 n601Var) {
        this.f255749a = str;
        this.f255750b = n601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwc1)) {
            return false;
        }
        wwc1 wwc1Var = (wwc1) obj;
        return wj50.m88271j(this.f255749a, wwc1Var.f255749a) && wj50.m88271j(this.f255750b, wwc1Var.f255750b);
    }

    public final int hashCode() {
        return this.f255750b.hashCode() + (this.f255749a.hashCode() * 31);
    }
}
