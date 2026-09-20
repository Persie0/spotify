package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jlt0 {

    /* JADX INFO: renamed from: a */
    public final String f113676a;

    /* JADX INFO: renamed from: b */
    public final int f113677b;

    /* JADX INFO: renamed from: c */
    public final nlt0 f113678c;

    /* JADX INFO: renamed from: d */
    public final boolean f113679d;

    /* JADX INFO: renamed from: e */
    public final eh00 f113680e;

    public jlt0(String str, int i, nlt0 nlt0Var, boolean z, eh00 eh00Var) {
        this.f113676a = str;
        this.f113677b = i;
        this.f113678c = nlt0Var;
        this.f113679d = z;
        this.f113680e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlt0)) {
            return false;
        }
        jlt0 jlt0Var = (jlt0) obj;
        return wj50.m88271j(this.f113676a, jlt0Var.f113676a) && this.f113677b == jlt0Var.f113677b && wj50.m88271j(this.f113678c, jlt0Var.f113678c) && this.f113679d == jlt0Var.f113679d && wj50.m88271j(this.f113680e, jlt0Var.f113680e);
    }

    public final int hashCode() {
        return this.f113680e.hashCode() + s571.m77245d((this.f113678c.hashCode() + mt60.m62800g(this.f113677b, this.f113676a.hashCode() * 31, 31)) * 31, 31, this.f113679d);
    }
}
