package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fm21 {

    /* JADX INFO: renamed from: a */
    public final String f70935a;

    /* JADX INFO: renamed from: b */
    public final int f70936b;

    /* JADX INFO: renamed from: c */
    public final int f70937c;

    public fm21(String str, int i, int i2) {
        this.f70935a = str;
        this.f70936b = i;
        this.f70937c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm21)) {
            return false;
        }
        fm21 fm21Var = (fm21) obj;
        return wj50.m88271j(this.f70935a, fm21Var.f70935a) && this.f70936b == fm21Var.f70936b && this.f70937c == fm21Var.f70937c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70937c) + mt60.m62800g(this.f70936b, this.f70935a.hashCode() * 31, 31);
    }
}
