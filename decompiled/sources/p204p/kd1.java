package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kd1 {

    /* JADX INFO: renamed from: a */
    public final String f121577a;

    /* JADX INFO: renamed from: b */
    public final String f121578b;

    /* JADX INFO: renamed from: c */
    public final String f121579c;

    /* JADX INFO: renamed from: d */
    public final String f121580d;

    /* JADX INFO: renamed from: e */
    public final String f121581e;

    public kd1(String str, String str2, String str3, String str4, String str5) {
        this.f121577a = str;
        this.f121578b = str2;
        this.f121579c = str3;
        this.f121580d = str4;
        this.f121581e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd1)) {
            return false;
        }
        kd1 kd1Var = (kd1) obj;
        return wj50.m88271j(this.f121577a, kd1Var.f121577a) && wj50.m88271j(this.f121578b, kd1Var.f121578b) && wj50.m88271j(this.f121579c, kd1Var.f121579c) && wj50.m88271j(this.f121580d, kd1Var.f121580d) && wj50.m88271j(this.f121581e, kd1Var.f121581e);
    }

    public final int hashCode() {
        return this.f121581e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f121577a.hashCode() * 31, 31, this.f121578b), 31, this.f121579c), 31, this.f121580d);
    }
}
