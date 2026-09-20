package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class mo2 {

    /* JADX INFO: renamed from: a */
    public final String f145548a;

    /* JADX INFO: renamed from: b */
    public final String f145549b;

    /* JADX INFO: renamed from: c */
    public final String f145550c;

    /* JADX INFO: renamed from: d */
    public final String f145551d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f145552e;

    /* JADX INFO: renamed from: f */
    public final int f145553f;

    /* JADX INFO: renamed from: g */
    public final Boolean f145554g;

    /* JADX INFO: renamed from: h */
    public final String f145555h;

    public mo2(String str, String str2, String str3, String str4, ArrayList arrayList, int i, Boolean bool, String str5) {
        this.f145548a = str;
        this.f145549b = str2;
        this.f145550c = str3;
        this.f145551d = str4;
        this.f145552e = arrayList;
        this.f145553f = i;
        this.f145554g = bool;
        this.f145555h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return this.f145548a.equals(mo2Var.f145548a) && wj50.m88271j(this.f145549b, mo2Var.f145549b) && this.f145550c.equals(mo2Var.f145550c) && this.f145551d.equals(mo2Var.f145551d) && this.f145552e.equals(mo2Var.f145552e) && this.f145553f == mo2Var.f145553f && wj50.m88271j(this.f145554g, mo2Var.f145554g) && wj50.m88271j(this.f145555h, mo2Var.f145555h);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f145553f, lq51.m59700f(this.f145552e, s571.m77243b(s571.m77243b(s571.m77243b(this.f145548a.hashCode() * 31, 31, this.f145549b), 31, this.f145550c), 31, this.f145551d), 31), 31);
        Boolean bool = this.f145554g;
        int iHashCode = (iM62800g + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f145555h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
