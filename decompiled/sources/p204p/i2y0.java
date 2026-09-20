package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i2y0 extends j2y0 {

    /* JADX INFO: renamed from: a */
    public final String f97940a;

    /* JADX INFO: renamed from: b */
    public final String f97941b;

    /* JADX INFO: renamed from: c */
    public final String f97942c;

    /* JADX INFO: renamed from: d */
    public final String f97943d;

    public i2y0(String str, String str2, String str3, String str4) {
        this.f97940a = str;
        this.f97941b = str2;
        this.f97942c = str3;
        this.f97943d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2y0)) {
            return false;
        }
        i2y0 i2y0Var = (i2y0) obj;
        return wj50.m88271j(this.f97940a, i2y0Var.f97940a) && wj50.m88271j(this.f97941b, i2y0Var.f97941b) && wj50.m88271j(this.f97942c, i2y0Var.f97942c) && wj50.m88271j(this.f97943d, i2y0Var.f97943d);
    }

    public final int hashCode() {
        return this.f97943d.hashCode() + s571.m77243b(s571.m77243b(this.f97940a.hashCode() * 31, 31, this.f97941b), 31, this.f97942c);
    }
}
