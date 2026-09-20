package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class el1 {

    /* JADX INFO: renamed from: a */
    public final String f60565a;

    /* JADX INFO: renamed from: b */
    public final int f60566b;

    /* JADX INFO: renamed from: c */
    public final String f60567c;

    /* JADX INFO: renamed from: d */
    public final String f60568d;

    public el1(String str, String str2, int i, String str3) {
        this.f60565a = str;
        this.f60566b = i;
        this.f60567c = str2;
        this.f60568d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el1)) {
            return false;
        }
        el1 el1Var = (el1) obj;
        return wj50.m88271j(this.f60565a, el1Var.f60565a) && this.f60566b == el1Var.f60566b && wj50.m88271j(this.f60567c, el1Var.f60567c) && wj50.m88271j(this.f60568d, el1Var.f60568d);
    }

    public final int hashCode() {
        return this.f60568d.hashCode() + s571.m77243b(f710.m40938f(this.f60566b, this.f60565a.hashCode() * 31, 31), 31, this.f60567c);
    }
}
