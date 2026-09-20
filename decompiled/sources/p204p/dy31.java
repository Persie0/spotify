package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dy31 {

    /* JADX INFO: renamed from: a */
    public final String f54161a;

    /* JADX INFO: renamed from: b */
    public final List f54162b;

    /* JADX INFO: renamed from: c */
    public final String f54163c;

    /* JADX INFO: renamed from: d */
    public final String f54164d;

    /* JADX INFO: renamed from: e */
    public final String f54165e;

    /* JADX INFO: renamed from: f */
    public final int f54166f;

    /* JADX INFO: renamed from: g */
    public final int f54167g;

    public dy31(String str, List list, String str2, String str3, String str4, int i, int i2) {
        this.f54161a = str;
        this.f54162b = list;
        this.f54163c = str2;
        this.f54164d = str3;
        this.f54165e = str4;
        this.f54166f = i;
        this.f54167g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy31)) {
            return false;
        }
        dy31 dy31Var = (dy31) obj;
        return wj50.m88271j(this.f54161a, dy31Var.f54161a) && wj50.m88271j(this.f54162b, dy31Var.f54162b) && wj50.m88271j(this.f54163c, dy31Var.f54163c) && wj50.m88271j(this.f54164d, dy31Var.f54164d) && wj50.m88271j(this.f54165e, dy31Var.f54165e) && this.f54166f == dy31Var.f54166f && this.f54167g == dy31Var.f54167g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54167g) + mt60.m62800g(this.f54166f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77244c(this.f54161a.hashCode() * 31, 31, this.f54162b), 31, this.f54163c), 31, this.f54164d), 31, this.f54165e), 31);
    }
}
