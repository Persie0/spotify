package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class by2 {

    /* JADX INFO: renamed from: a */
    public final String f32045a;

    /* JADX INFO: renamed from: b */
    public final String f32046b;

    /* JADX INFO: renamed from: c */
    public final String f32047c;

    /* JADX INFO: renamed from: d */
    public final String f32048d;

    public by2(String str, String str2, String str3, String str4) {
        this.f32045a = str;
        this.f32046b = str2;
        this.f32047c = str3;
        this.f32048d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return wj50.m88271j(this.f32045a, by2Var.f32045a) && wj50.m88271j(this.f32046b, by2Var.f32046b) && wj50.m88271j(this.f32047c, by2Var.f32047c) && wj50.m88271j(this.f32048d, by2Var.f32048d);
    }

    public final int hashCode() {
        return this.f32048d.hashCode() + s571.m77243b(s571.m77243b(this.f32045a.hashCode() * 31, 31, this.f32046b), 31, this.f32047c);
    }
}
