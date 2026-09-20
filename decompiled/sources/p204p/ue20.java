package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ue20 {

    /* JADX INFO: renamed from: a */
    public final String f229370a;

    /* JADX INFO: renamed from: b */
    public final String f229371b;

    /* JADX INFO: renamed from: c */
    public final String f229372c;

    /* JADX INFO: renamed from: d */
    public final String f229373d;

    /* JADX INFO: renamed from: e */
    public final String f229374e;

    /* JADX INFO: renamed from: f */
    public final Long f229375f;

    /* JADX INFO: renamed from: g */
    public final String f229376g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f229377h;

    /* JADX INFO: renamed from: i */
    public final sp8 f229378i;

    public ue20(String str, String str2, String str3, String str4, String str5, Long l, String str6, ArrayList arrayList, sp8 sp8Var) {
        this.f229370a = str;
        this.f229371b = str2;
        this.f229372c = str3;
        this.f229373d = str4;
        this.f229374e = str5;
        this.f229375f = l;
        this.f229376g = str6;
        this.f229377h = arrayList;
        this.f229378i = sp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue20)) {
            return false;
        }
        ue20 ue20Var = (ue20) obj;
        return wj50.m88271j(this.f229370a, ue20Var.f229370a) && wj50.m88271j(this.f229371b, ue20Var.f229371b) && wj50.m88271j(this.f229372c, ue20Var.f229372c) && wj50.m88271j(this.f229373d, ue20Var.f229373d) && wj50.m88271j(this.f229374e, ue20Var.f229374e) && wj50.m88271j(this.f229375f, ue20Var.f229375f) && wj50.m88271j(this.f229376g, ue20Var.f229376g) && this.f229377h.equals(ue20Var.f229377h) && wj50.m88271j(this.f229378i, ue20Var.f229378i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f229370a.hashCode() * 31, 31, this.f229371b), 31, this.f229372c);
        String str = this.f229373d;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229374e);
        Long l = this.f229375f;
        int iHashCode = (((iM77243b2 + (l == null ? 0 : l.hashCode())) * 31) + 1703420766) * 31;
        String str2 = this.f229376g;
        int iM59700f = lq51.m59700f(this.f229377h, s571.m77245d((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) - 2047944555) * 31, 31, false), 31);
        sp8 sp8Var = this.f229378i;
        return iM59700f + (sp8Var != null ? sp8Var.hashCode() : 0);
    }
}
