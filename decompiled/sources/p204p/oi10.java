package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oi10 extends pi10 {

    /* JADX INFO: renamed from: a */
    public final String f165638a;

    /* JADX INFO: renamed from: b */
    public final String f165639b;

    /* JADX INFO: renamed from: c */
    public final int f165640c;

    /* JADX INFO: renamed from: d */
    public final String f165641d;

    /* JADX INFO: renamed from: e */
    public final String f165642e;

    public oi10(int i, String str, String str2, String str3, String str4) {
        this.f165638a = str;
        this.f165639b = str2;
        this.f165640c = i;
        this.f165641d = str3;
        this.f165642e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi10)) {
            return false;
        }
        oi10 oi10Var = (oi10) obj;
        return wj50.m88271j(this.f165638a, oi10Var.f165638a) && wj50.m88271j(this.f165639b, oi10Var.f165639b) && this.f165640c == oi10Var.f165640c && this.f165641d.equals(oi10Var.f165641d) && wj50.m88271j(this.f165642e, oi10Var.f165642e);
    }

    public final int hashCode() {
        return this.f165642e.hashCode() + s571.m77243b(f710.m40938f(this.f165640c, s571.m77243b(this.f165638a.hashCode() * 31, 31, this.f165639b), 31), 31, this.f165641d);
    }
}
