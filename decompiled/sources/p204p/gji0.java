package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gji0 {

    /* JADX INFO: renamed from: a */
    public final String f80486a;

    /* JADX INFO: renamed from: b */
    public final String f80487b;

    /* JADX INFO: renamed from: c */
    public final String f80488c;

    public gji0(String str, String str2, String str3) {
        this.f80486a = str;
        this.f80487b = str2;
        this.f80488c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gji0)) {
            return false;
        }
        gji0 gji0Var = (gji0) obj;
        return wj50.m88271j(this.f80486a, gji0Var.f80486a) && wj50.m88271j(this.f80487b, gji0Var.f80487b) && wj50.m88271j(this.f80488c, gji0Var.f80488c);
    }

    public final int hashCode() {
        return this.f80488c.hashCode() + s571.m77243b(this.f80486a.hashCode() * 31, 31, this.f80487b);
    }
}
