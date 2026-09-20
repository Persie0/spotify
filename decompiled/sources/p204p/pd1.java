package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pd1 {

    /* JADX INFO: renamed from: a */
    public final String f176320a;

    /* JADX INFO: renamed from: b */
    public final String f176321b;

    /* JADX INFO: renamed from: c */
    public final String f176322c;

    public pd1(String str, String str2, String str3) {
        this.f176320a = str;
        this.f176321b = str2;
        this.f176322c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd1)) {
            return false;
        }
        pd1 pd1Var = (pd1) obj;
        return wj50.m88271j(this.f176320a, pd1Var.f176320a) && wj50.m88271j(this.f176321b, pd1Var.f176321b) && wj50.m88271j(this.f176322c, pd1Var.f176322c);
    }

    public final int hashCode() {
        return this.f176322c.hashCode() + s571.m77243b(this.f176320a.hashCode() * 31, 31, this.f176321b);
    }
}
