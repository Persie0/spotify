package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mbv0 {

    /* JADX INFO: renamed from: a */
    public final String f141976a;

    /* JADX INFO: renamed from: b */
    public final String f141977b;

    /* JADX INFO: renamed from: c */
    public final boolean f141978c;

    /* JADX INFO: renamed from: d */
    public final boolean f141979d;

    /* JADX INFO: renamed from: e */
    public final boolean f141980e;

    /* JADX INFO: renamed from: f */
    public final boolean f141981f;

    /* JADX INFO: renamed from: g */
    public final boolean f141982g;

    /* JADX INFO: renamed from: h */
    public final List f141983h;

    public mbv0(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        this.f141976a = str;
        this.f141977b = str2;
        this.f141978c = z;
        this.f141979d = z2;
        this.f141980e = z3;
        this.f141981f = z4;
        this.f141982g = z5;
        this.f141983h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbv0)) {
            return false;
        }
        mbv0 mbv0Var = (mbv0) obj;
        return wj50.m88271j(this.f141976a, mbv0Var.f141976a) && wj50.m88271j(this.f141977b, mbv0Var.f141977b) && this.f141978c == mbv0Var.f141978c && this.f141979d == mbv0Var.f141979d && this.f141980e == mbv0Var.f141980e && this.f141981f == mbv0Var.f141981f && this.f141982g == mbv0Var.f141982g && wj50.m88271j(this.f141983h, mbv0Var.f141983h);
    }

    public final int hashCode() {
        int iHashCode = this.f141976a.hashCode() * 31;
        String str = this.f141977b;
        return this.f141983h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f141978c), 31, this.f141979d), 31, this.f141980e), 31, this.f141981f), 31, this.f141982g);
    }
}
