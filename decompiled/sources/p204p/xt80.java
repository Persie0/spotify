package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xt80 {

    /* JADX INFO: renamed from: a */
    public final String f265793a;

    /* JADX INFO: renamed from: b */
    public final String f265794b;

    /* JADX INFO: renamed from: c */
    public final boolean f265795c;

    /* JADX INFO: renamed from: d */
    public final boolean f265796d;

    /* JADX INFO: renamed from: e */
    public final boolean f265797e;

    /* JADX INFO: renamed from: f */
    public final int f265798f;

    public xt80(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.f265793a = str;
        this.f265794b = str2;
        this.f265795c = z;
        this.f265796d = z2;
        this.f265797e = z3;
        this.f265798f = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92009a() {
        return this.f265795c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt80)) {
            return false;
        }
        xt80 xt80Var = (xt80) obj;
        return wj50.m88271j(this.f265793a, xt80Var.f265793a) && wj50.m88271j(this.f265794b, xt80Var.f265794b) && this.f265795c == xt80Var.f265795c && this.f265796d == xt80Var.f265796d && this.f265797e == xt80Var.f265797e && this.f265798f == xt80Var.f265798f;
    }

    public final int hashCode() {
        return edb.m38547C(this.f265798f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f265793a.hashCode() * 31, 31, this.f265794b), 31, this.f265795c), 31, this.f265796d), 31, this.f265797e);
    }
}
