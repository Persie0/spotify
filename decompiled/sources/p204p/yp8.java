package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yp8 {

    /* JADX INFO: renamed from: a */
    public final String f274871a;

    /* JADX INFO: renamed from: b */
    public final String f274872b;

    /* JADX INFO: renamed from: c */
    public final String f274873c;

    public yp8(String str, String str2, String str3) {
        this.f274871a = str;
        this.f274872b = str2;
        this.f274873c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp8)) {
            return false;
        }
        yp8 yp8Var = (yp8) obj;
        return wj50.m88271j(this.f274871a, yp8Var.f274871a) && wj50.m88271j(this.f274872b, yp8Var.f274872b) && wj50.m88271j(this.f274873c, yp8Var.f274873c);
    }

    public final int hashCode() {
        return this.f274873c.hashCode() + s571.m77243b(this.f274871a.hashCode() * 31, 31, this.f274872b);
    }
}
