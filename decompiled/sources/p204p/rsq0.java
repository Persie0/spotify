package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rsq0 {

    /* JADX INFO: renamed from: a */
    public final String f202381a;

    /* JADX INFO: renamed from: b */
    public final String f202382b;

    /* JADX INFO: renamed from: c */
    public final long f202383c;

    /* JADX INFO: renamed from: d */
    public final String f202384d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f202385e;

    /* JADX INFO: renamed from: f */
    public final Long f202386f;

    /* JADX INFO: renamed from: g */
    public final Integer f202387g;

    /* JADX INFO: renamed from: h */
    public final List f202388h;

    /* JADX INFO: renamed from: i */
    public final int f202389i;

    /* JADX INFO: renamed from: j */
    public final String f202390j;

    /* JADX INFO: renamed from: k */
    public final String f202391k;

    /* JADX INFO: renamed from: l */
    public final String f202392l;

    public rsq0(String str, String str2, long j, String str3, ArrayList arrayList, Long l, Integer num, List list, int i, String str4, String str5, String str6) {
        this.f202381a = str;
        this.f202382b = str2;
        this.f202383c = j;
        this.f202384d = str3;
        this.f202385e = arrayList;
        this.f202386f = l;
        this.f202387g = num;
        this.f202388h = list;
        this.f202389i = i;
        this.f202390j = str4;
        this.f202391k = str5;
        this.f202392l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsq0)) {
            return false;
        }
        rsq0 rsq0Var = (rsq0) obj;
        return wj50.m88271j(this.f202381a, rsq0Var.f202381a) && wj50.m88271j(this.f202382b, rsq0Var.f202382b) && this.f202383c == rsq0Var.f202383c && wj50.m88271j(this.f202384d, rsq0Var.f202384d) && this.f202385e.equals(rsq0Var.f202385e) && wj50.m88271j(this.f202386f, rsq0Var.f202386f) && wj50.m88271j(this.f202387g, rsq0Var.f202387g) && wj50.m88271j(this.f202388h, rsq0Var.f202388h) && this.f202389i == rsq0Var.f202389i && wj50.m88271j(this.f202390j, rsq0Var.f202390j) && wj50.m88271j(this.f202391k, rsq0Var.f202391k) && wj50.m88271j(this.f202392l, rsq0Var.f202392l);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f202385e, s571.m77243b(dq60.m36605e(s571.m77243b(this.f202381a.hashCode() * 31, 31, this.f202382b), this.f202383c, 31), 31, this.f202384d), 31);
        Long l = this.f202386f;
        int iHashCode = (iM59700f + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f202387g;
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f202389i, s571.m77244c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f202388h), 31), 31, this.f202390j), 31, this.f202391k);
        String str = this.f202392l;
        return iM77243b + (str != null ? str.hashCode() : 0);
    }
}
