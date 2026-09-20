package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class r7o0 {

    /* JADX INFO: renamed from: a */
    public final String f196616a;

    /* JADX INFO: renamed from: b */
    public final String f196617b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f196618c;

    /* JADX INFO: renamed from: d */
    public final String f196619d;

    /* JADX INFO: renamed from: e */
    public final String f196620e;

    /* JADX INFO: renamed from: f */
    public final int f196621f;

    /* JADX INFO: renamed from: g */
    public final int f196622g;

    /* JADX INFO: renamed from: h */
    public final String f196623h;

    /* JADX INFO: renamed from: i */
    public final int f196624i;

    public r7o0(String str, String str2, ArrayList arrayList, String str3, String str4, int i, int i2, String str5, int i3) {
        this.f196616a = str;
        this.f196617b = str2;
        this.f196618c = arrayList;
        this.f196619d = str3;
        this.f196620e = str4;
        this.f196621f = i;
        this.f196622g = i2;
        this.f196623h = str5;
        this.f196624i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7o0)) {
            return false;
        }
        r7o0 r7o0Var = (r7o0) obj;
        return this.f196616a.equals(r7o0Var.f196616a) && this.f196617b.equals(r7o0Var.f196617b) && this.f196618c.equals(r7o0Var.f196618c) && this.f196619d.equals(r7o0Var.f196619d) && this.f196620e.equals(r7o0Var.f196620e) && this.f196621f == r7o0Var.f196621f && this.f196622g == r7o0Var.f196622g && this.f196623h.equals(r7o0Var.f196623h) && this.f196624i == r7o0Var.f196624i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f196622g, f710.m40938f(this.f196621f, s571.m77243b(s571.m77243b(lq51.m59700f(this.f196618c, s571.m77243b(this.f196616a.hashCode() * 31, 31, this.f196617b), 961), 31, this.f196619d), 31, this.f196620e), 31), 31), 31, this.f196623h);
        int i = this.f196624i;
        return iM77243b + (i == 0 ? 0 : edb.m38547C(i));
    }
}
