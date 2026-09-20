package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eyj0 {

    /* JADX INFO: renamed from: a */
    public final String f64107a;

    /* JADX INFO: renamed from: b */
    public final String f64108b;

    /* JADX INFO: renamed from: c */
    public final String f64109c;

    /* JADX INFO: renamed from: d */
    public final int f64110d;

    /* JADX INFO: renamed from: e */
    public final zxj0 f64111e;

    public eyj0(String str, String str2, String str3, int i, zxj0 zxj0Var) {
        this.f64107a = str;
        this.f64108b = str2;
        this.f64109c = str3;
        this.f64110d = i;
        this.f64111e = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyj0)) {
            return false;
        }
        eyj0 eyj0Var = (eyj0) obj;
        return wj50.m88271j(this.f64107a, eyj0Var.f64107a) && wj50.m88271j(this.f64108b, eyj0Var.f64108b) && wj50.m88271j(this.f64109c, eyj0Var.f64109c) && this.f64110d == eyj0Var.f64110d && this.f64111e.equals(eyj0Var.f64111e);
    }

    public final int hashCode() {
        return this.f64111e.hashCode() + f710.m40938f(this.f64110d, s571.m77243b(s571.m77243b(this.f64107a.hashCode() * 31, 31, this.f64108b), 31, this.f64109c), 31);
    }
}
