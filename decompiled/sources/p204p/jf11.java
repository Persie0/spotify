package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jf11 {

    /* JADX INFO: renamed from: a */
    public final String f111790a;

    /* JADX INFO: renamed from: b */
    public final String f111791b;

    /* JADX INFO: renamed from: c */
    public final String f111792c;

    public jf11(String str, String str2, String str3) {
        this.f111790a = str;
        this.f111791b = str2;
        this.f111792c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf11)) {
            return false;
        }
        jf11 jf11Var = (jf11) obj;
        return wj50.m88271j(this.f111790a, jf11Var.f111790a) && wj50.m88271j(this.f111791b, jf11Var.f111791b) && wj50.m88271j(this.f111792c, jf11Var.f111792c);
    }

    public final int hashCode() {
        return this.f111792c.hashCode() + s571.m77243b(this.f111790a.hashCode() * 31, 31, this.f111791b);
    }

    public /* synthetic */ jf11() {
        this("", "", "");
    }
}
