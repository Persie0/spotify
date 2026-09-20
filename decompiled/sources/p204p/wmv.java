package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wmv implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final String f252982a;

    /* JADX INFO: renamed from: b */
    public final String f252983b;

    /* JADX INFO: renamed from: c */
    public final String f252984c;

    /* JADX INFO: renamed from: d */
    public final int f252985d;

    /* JADX INFO: renamed from: e */
    public final List f252986e;

    /* JADX INFO: renamed from: f */
    public final List f252987f;

    /* JADX INFO: renamed from: g */
    public final boolean f252988g;

    /* JADX INFO: renamed from: h */
    public final boolean f252989h;

    /* JADX INFO: renamed from: i */
    public final vv11 f252990i;

    /* JADX INFO: renamed from: j */
    public final rx41 f252991j;

    public wmv(String str, String str2, String str3, int i, List list, List list2, boolean z, boolean z2, vv11 vv11Var, rx41 rx41Var) {
        this.f252982a = str;
        this.f252983b = str2;
        this.f252984c = str3;
        this.f252985d = i;
        this.f252986e = list;
        this.f252987f = list2;
        this.f252988g = z;
        this.f252989h = z2;
        this.f252990i = vv11Var;
        this.f252991j = rx41Var;
    }

    /* JADX INFO: renamed from: b */
    public static wmv m88568b(wmv wmvVar, String str, int i, List list, List list2, boolean z, boolean z2, vv11 vv11Var, rx41 rx41Var, int i2) {
        String str2 = wmvVar.f252982a;
        if ((i2 & 2) != 0) {
            str = wmvVar.f252983b;
        }
        String str3 = str;
        String str4 = wmvVar.f252984c;
        if ((i2 & 8) != 0) {
            i = wmvVar.f252985d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = wmvVar.f252986e;
        }
        List list3 = list;
        List list4 = (i2 & 32) != 0 ? wmvVar.f252987f : list2;
        boolean z3 = (i2 & 64) != 0 ? wmvVar.f252988g : z;
        boolean z4 = (i2 & 128) != 0 ? wmvVar.f252989h : z2;
        vv11 vv11Var2 = (i2 & 256) != 0 ? wmvVar.f252990i : vv11Var;
        rx41 rx41Var2 = (i2 & 512) != 0 ? wmvVar.f252991j : rx41Var;
        wmvVar.getClass();
        return new wmv(str2, str3, str4, i3, list3, list4, z3, z4, vv11Var2, rx41Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmv)) {
            return false;
        }
        wmv wmvVar = (wmv) obj;
        return wj50.m88271j(this.f252982a, wmvVar.f252982a) && wj50.m88271j(this.f252983b, wmvVar.f252983b) && wj50.m88271j(this.f252984c, wmvVar.f252984c) && this.f252985d == wmvVar.f252985d && wj50.m88271j(this.f252986e, wmvVar.f252986e) && wj50.m88271j(this.f252987f, wmvVar.f252987f) && this.f252988g == wmvVar.f252988g && this.f252989h == wmvVar.f252989h && wj50.m88271j(this.f252990i, wmvVar.f252990i) && wj50.m88271j(this.f252991j, wmvVar.f252991j);
    }

    public final int hashCode() {
        int iHashCode = this.f252982a.hashCode() * 31;
        String str = this.f252983b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f252984c;
        int iHashCode3 = (this.f252990i.hashCode() + s571.m77245d(s571.m77245d(s571.m77244c(s571.m77244c(f710.m40938f(this.f252985d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f252986e), 31, this.f252987f), 31, this.f252988g), 31, this.f252989h)) * 31;
        rx41 rx41Var = this.f252991j;
        return iHashCode3 + (rx41Var != null ? rx41Var.hashCode() : 0);
    }

    public /* synthetic */ wmv(String str, String str2, String str3, rx41 rx41Var, int i) {
        vv11 vv11Var = new vv11(1, 2);
        rx41Var = (i & 512) != 0 ? null : rx41Var;
        lau lauVar = lau.f131415a;
        this(str, str2, str3, 4, lauVar, lauVar, false, false, vv11Var, rx41Var);
    }
}
