package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x69 {

    /* JADX INFO: renamed from: a */
    public final String f258611a;

    /* JADX INFO: renamed from: b */
    public final String f258612b;

    /* JADX INFO: renamed from: c */
    public final String f258613c;

    /* JADX INFO: renamed from: d */
    public final String f258614d;

    /* JADX INFO: renamed from: e */
    public final boolean f258615e;

    /* JADX INFO: renamed from: f */
    public final String f258616f;

    public x69(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f258611a = str;
        this.f258612b = str2;
        this.f258613c = str3;
        this.f258614d = str4;
        this.f258615e = z;
        this.f258616f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x69)) {
            return false;
        }
        x69 x69Var = (x69) obj;
        return wj50.m88271j(this.f258611a, x69Var.f258611a) && wj50.m88271j(this.f258612b, x69Var.f258612b) && wj50.m88271j(this.f258613c, x69Var.f258613c) && wj50.m88271j(this.f258614d, x69Var.f258614d) && this.f258615e == x69Var.f258615e && wj50.m88271j(this.f258616f, x69Var.f258616f);
    }

    public final int hashCode() {
        return this.f258616f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f258611a.hashCode() * 31, 31, this.f258612b), 31, this.f258613c), 31, this.f258614d), 31, this.f258615e);
    }
}
