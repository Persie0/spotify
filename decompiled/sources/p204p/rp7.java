package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rp7 {

    /* JADX INFO: renamed from: a */
    public final String f201438a;

    /* JADX INFO: renamed from: b */
    public final String f201439b;

    /* JADX INFO: renamed from: c */
    public final String f201440c;

    public rp7(String str, String str2, String str3) {
        this.f201438a = str;
        this.f201439b = str2;
        this.f201440c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp7)) {
            return false;
        }
        rp7 rp7Var = (rp7) obj;
        return wj50.m88271j(this.f201438a, rp7Var.f201438a) && wj50.m88271j(this.f201439b, rp7Var.f201439b) && wj50.m88271j(this.f201440c, rp7Var.f201440c);
    }

    public final int hashCode() {
        return this.f201440c.hashCode() + s571.m77243b(this.f201438a.hashCode() * 31, 31, this.f201439b);
    }
}
