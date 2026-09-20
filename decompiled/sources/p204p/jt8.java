package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jt8 {

    /* JADX INFO: renamed from: a */
    public final int f115760a;

    /* JADX INFO: renamed from: b */
    public final eh00 f115761b;

    public jt8(int i, eh00 eh00Var) {
        this.f115760a = i;
        this.f115761b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt8)) {
            return false;
        }
        jt8 jt8Var = (jt8) obj;
        return this.f115760a == jt8Var.f115760a && wj50.m88271j(this.f115761b, jt8Var.f115761b);
    }

    public final int hashCode() {
        return this.f115761b.hashCode() + (Integer.hashCode(this.f115760a) * 31);
    }
}
