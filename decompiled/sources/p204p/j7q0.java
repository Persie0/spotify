package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j7q0 {

    /* JADX INFO: renamed from: a */
    public final String f109650a;

    /* JADX INFO: renamed from: b */
    public final int f109651b;

    /* JADX INFO: renamed from: c */
    public final int f109652c;

    public j7q0(String str, int i, int i2) {
        this.f109650a = str;
        this.f109651b = i;
        this.f109652c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7q0)) {
            return false;
        }
        j7q0 j7q0Var = (j7q0) obj;
        return wj50.m88271j(this.f109650a, j7q0Var.f109650a) && this.f109651b == j7q0Var.f109651b && this.f109652c == j7q0Var.f109652c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109652c) + mt60.m62800g(this.f109651b, this.f109650a.hashCode() * 31, 31);
    }
}
