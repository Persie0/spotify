package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class co00 {

    /* JADX INFO: renamed from: a */
    public final xn00 f40142a;

    /* JADX INFO: renamed from: b */
    public final String f40143b;

    /* JADX INFO: renamed from: c */
    public final String f40144c;

    /* JADX INFO: renamed from: d */
    public final String f40145d;

    public co00(xn00 xn00Var, String str, String str2, String str3) {
        this.f40142a = xn00Var;
        this.f40143b = str;
        this.f40144c = str2;
        this.f40145d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co00)) {
            return false;
        }
        co00 co00Var = (co00) obj;
        return wj50.m88271j(this.f40142a, co00Var.f40142a) && wj50.m88271j(this.f40143b, co00Var.f40143b) && wj50.m88271j(this.f40144c, co00Var.f40144c) && wj50.m88271j(this.f40145d, co00Var.f40145d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f40142a.hashCode() * 31, 31, this.f40143b), 31, this.f40144c);
        String str = this.f40145d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
