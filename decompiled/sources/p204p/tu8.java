package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tu8 implements uu8 {

    /* JADX INFO: renamed from: a */
    public final String f223786a;

    /* JADX INFO: renamed from: b */
    public final String f223787b;

    /* JADX INFO: renamed from: c */
    public final String f223788c;

    /* JADX INFO: renamed from: d */
    public final lw8 f223789d;

    public tu8(String str, String str2, String str3, lw8 lw8Var) {
        this.f223786a = str;
        this.f223787b = str2;
        this.f223788c = str3;
        this.f223789d = lw8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu8)) {
            return false;
        }
        tu8 tu8Var = (tu8) obj;
        return wj50.m88271j(this.f223786a, tu8Var.f223786a) && wj50.m88271j(this.f223787b, tu8Var.f223787b) && wj50.m88271j(this.f223788c, tu8Var.f223788c) && this.f223789d == tu8Var.f223789d;
    }

    public final int hashCode() {
        return this.f223789d.hashCode() + s571.m77243b(s571.m77243b(this.f223786a.hashCode() * 31, 31, this.f223787b), 31, this.f223788c);
    }
}
