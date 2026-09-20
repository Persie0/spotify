package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class chw0 {

    /* JADX INFO: renamed from: a */
    public final String f38125a;

    /* JADX INFO: renamed from: b */
    public final boolean f38126b;

    /* JADX INFO: renamed from: c */
    public final boolean f38127c;

    /* JADX INFO: renamed from: d */
    public final boolean f38128d;

    /* JADX INFO: renamed from: e */
    public final boolean f38129e;

    public chw0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f38125a = str;
        this.f38126b = z;
        this.f38127c = z2;
        this.f38128d = z3;
        this.f38129e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chw0)) {
            return false;
        }
        chw0 chw0Var = (chw0) obj;
        return wj50.m88271j(this.f38125a, chw0Var.f38125a) && this.f38126b == chw0Var.f38126b && this.f38127c == chw0Var.f38127c && this.f38128d == chw0Var.f38128d && this.f38129e == chw0Var.f38129e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38129e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f38125a.hashCode() * 31, 31, this.f38126b), 31, this.f38127c), 31, this.f38128d);
    }
}
