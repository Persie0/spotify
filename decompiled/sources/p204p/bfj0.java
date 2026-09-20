package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bfj0 extends dfj0 {

    /* JADX INFO: renamed from: a */
    public final String f26731a;

    /* JADX INFO: renamed from: b */
    public final String f26732b;

    /* JADX INFO: renamed from: c */
    public final boolean f26733c;

    /* JADX INFO: renamed from: d */
    public final boolean f26734d;

    /* JADX INFO: renamed from: e */
    public final String f26735e;

    public bfj0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f26731a = str;
        this.f26732b = str2;
        this.f26733c = z;
        this.f26734d = z2;
        this.f26735e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfj0)) {
            return false;
        }
        bfj0 bfj0Var = (bfj0) obj;
        return wj50.m88271j(this.f26731a, bfj0Var.f26731a) && wj50.m88271j(this.f26732b, bfj0Var.f26732b) && this.f26733c == bfj0Var.f26733c && this.f26734d == bfj0Var.f26734d && wj50.m88271j(this.f26735e, bfj0Var.f26735e);
    }

    public final int hashCode() {
        return this.f26735e.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(this.f26731a.hashCode() * 31, 31, this.f26732b), 31, this.f26733c), 31, this.f26734d);
    }
}
