package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c36 {

    /* JADX INFO: renamed from: a */
    public final String f33568a;

    /* JADX INFO: renamed from: b */
    public final String f33569b;

    /* JADX INFO: renamed from: c */
    public final String f33570c;

    /* JADX INFO: renamed from: d */
    public final boolean f33571d;

    /* JADX INFO: renamed from: e */
    public final boolean f33572e;

    /* JADX INFO: renamed from: f */
    public final boolean f33573f;

    /* JADX INFO: renamed from: g */
    public final boolean f33574g;

    /* JADX INFO: renamed from: h */
    public final boolean f33575h;

    /* JADX INFO: renamed from: i */
    public final List f33576i;

    public c36(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        this.f33568a = str;
        this.f33569b = str2;
        this.f33570c = str3;
        this.f33571d = z;
        this.f33572e = z2;
        this.f33573f = z3;
        this.f33574g = z4;
        this.f33575h = z5;
        this.f33576i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c36)) {
            return false;
        }
        c36 c36Var = (c36) obj;
        return wj50.m88271j(this.f33568a, c36Var.f33568a) && wj50.m88271j(this.f33569b, c36Var.f33569b) && wj50.m88271j(this.f33570c, c36Var.f33570c) && this.f33571d == c36Var.f33571d && this.f33572e == c36Var.f33572e && this.f33573f == c36Var.f33573f && this.f33574g == c36Var.f33574g && this.f33575h == c36Var.f33575h && wj50.m88271j(this.f33576i, c36Var.f33576i);
    }

    public final int hashCode() {
        int iHashCode = this.f33568a.hashCode() * 31;
        String str = this.f33569b;
        return this.f33576i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f33570c), 31, this.f33571d), 31, this.f33572e), 31, this.f33573f), 31, this.f33574g), 31, this.f33575h);
    }
}
