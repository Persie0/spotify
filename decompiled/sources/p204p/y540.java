package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y540 {

    /* JADX INFO: renamed from: a */
    public final String f269330a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f269331b;

    /* JADX INFO: renamed from: c */
    public final int f269332c;

    /* JADX INFO: renamed from: d */
    public final String f269333d;

    /* JADX INFO: renamed from: e */
    public final String f269334e;

    /* JADX INFO: renamed from: f */
    public final String f269335f;

    /* JADX INFO: renamed from: g */
    public final boolean f269336g;

    /* JADX INFO: renamed from: h */
    public final boolean f269337h;

    public y540(String str, ArrayList arrayList, int i, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f269330a = str;
        this.f269331b = arrayList;
        this.f269332c = i;
        this.f269333d = str2;
        this.f269334e = str3;
        this.f269335f = str4;
        this.f269336g = z;
        this.f269337h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y540)) {
            return false;
        }
        y540 y540Var = (y540) obj;
        return wj50.m88271j(this.f269330a, y540Var.f269330a) && this.f269331b.equals(y540Var.f269331b) && this.f269332c == y540Var.f269332c && wj50.m88271j(this.f269333d, y540Var.f269333d) && wj50.m88271j(this.f269334e, y540Var.f269334e) && wj50.m88271j(this.f269335f, y540Var.f269335f) && this.f269336g == y540Var.f269336g && this.f269337h == y540Var.f269337h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f269332c, lq51.m59700f(this.f269331b, this.f269330a.hashCode() * 31, 31), 31), 31, this.f269333d);
        String str = this.f269334e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f269335f;
        return Boolean.hashCode(this.f269337h) + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f269336g);
    }
}
