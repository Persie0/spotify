package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k9v0 {

    /* JADX INFO: renamed from: a */
    public final int f120696a;

    /* JADX INFO: renamed from: b */
    public final t4v0 f120697b;

    /* JADX INFO: renamed from: c */
    public final boolean f120698c;

    /* JADX INFO: renamed from: d */
    public final String f120699d;

    /* JADX INFO: renamed from: e */
    public final int f120700e;

    public k9v0(int i, t4v0 t4v0Var, boolean z, String str, int i2) {
        this.f120696a = i;
        this.f120697b = t4v0Var;
        this.f120698c = z;
        this.f120699d = str;
        this.f120700e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9v0)) {
            return false;
        }
        k9v0 k9v0Var = (k9v0) obj;
        return this.f120696a == k9v0Var.f120696a && wj50.m88271j(this.f120697b, k9v0Var.f120697b) && this.f120698c == k9v0Var.f120698c && wj50.m88271j(this.f120699d, k9v0Var.f120699d) && this.f120700e == k9v0Var.f120700e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120700e) + s571.m77243b(s571.m77245d((this.f120697b.hashCode() + (Integer.hashCode(this.f120696a) * 31)) * 31, 31, this.f120698c), 31, this.f120699d);
    }
}
