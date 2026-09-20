package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b26 {

    /* JADX INFO: renamed from: a */
    public final String f22503a;

    /* JADX INFO: renamed from: b */
    public final String f22504b;

    /* JADX INFO: renamed from: c */
    public final String f22505c;

    public b26(String str, String str2, String str3) {
        this.f22503a = str;
        this.f22504b = str2;
        this.f22505c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26)) {
            return false;
        }
        b26 b26Var = (b26) obj;
        return wj50.m88271j(this.f22503a, b26Var.f22503a) && wj50.m88271j(this.f22504b, b26Var.f22504b) && wj50.m88271j(this.f22505c, b26Var.f22505c);
    }

    public final int hashCode() {
        return this.f22505c.hashCode() + s571.m77243b(this.f22503a.hashCode() * 31, 31, this.f22504b);
    }
}
