package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ijb1 {

    /* JADX INFO: renamed from: a */
    public final String f102777a;

    /* JADX INFO: renamed from: b */
    public final f5u f102778b;

    /* JADX INFO: renamed from: c */
    public final fh0 f102779c;

    /* JADX INFO: renamed from: d */
    public final String f102780d;

    /* JADX INFO: renamed from: e */
    public final String f102781e;

    /* JADX INFO: renamed from: f */
    public final String f102782f;

    /* JADX INFO: renamed from: g */
    public final String f102783g;

    public ijb1(String str, f5u f5uVar, fh0 fh0Var, String str2, String str3, String str4, String str5) {
        this.f102777a = str;
        this.f102778b = f5uVar;
        this.f102779c = fh0Var;
        this.f102780d = str2;
        this.f102781e = str3;
        this.f102782f = str4;
        this.f102783g = str5;
    }

    /* JADX INFO: renamed from: a */
    public final fh0 m50787a() {
        return this.f102779c;
    }

    /* JADX INFO: renamed from: b */
    public final f5u m50788b() {
        return this.f102778b;
    }

    /* JADX INFO: renamed from: c */
    public final String m50789c() {
        return this.f102777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb1)) {
            return false;
        }
        ijb1 ijb1Var = (ijb1) obj;
        return wj50.m88271j(this.f102777a, ijb1Var.f102777a) && wj50.m88271j(this.f102778b, ijb1Var.f102778b) && wj50.m88271j(this.f102779c, ijb1Var.f102779c) && wj50.m88271j(this.f102780d, ijb1Var.f102780d) && wj50.m88271j(this.f102781e, ijb1Var.f102781e) && wj50.m88271j(this.f102782f, ijb1Var.f102782f) && wj50.m88271j(this.f102783g, ijb1Var.f102783g);
    }

    public final int hashCode() {
        return this.f102783g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f102779c.hashCode() + ((this.f102778b.hashCode() + (this.f102777a.hashCode() * 31)) * 31)) * 31, 31, this.f102780d), 31, this.f102781e), 31, this.f102782f);
    }
}
