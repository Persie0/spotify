package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f137531a;

    /* JADX INFO: renamed from: b */
    public final t0d0 f137532b;

    /* JADX INFO: renamed from: c */
    public final String f137533c;

    /* JADX INFO: renamed from: d */
    public final String f137534d;

    /* JADX INFO: renamed from: e */
    public final String f137535e;

    /* JADX INFO: renamed from: f */
    public final Long f137536f;

    /* JADX INFO: renamed from: g */
    public final r891 f137537g;

    /* JADX INFO: renamed from: h */
    public final List f137538h;

    /* JADX INFO: renamed from: i */
    public final int f137539i;

    public lwc0(String str, t0d0 t0d0Var, String str2, String str3, String str4, Long l, r891 r891Var, List list, int i) {
        this.f137531a = str;
        this.f137532b = t0d0Var;
        this.f137533c = str2;
        this.f137534d = str3;
        this.f137535e = str4;
        this.f137536f = l;
        this.f137537g = r891Var;
        this.f137538h = list;
        this.f137539i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwc0)) {
            return false;
        }
        lwc0 lwc0Var = (lwc0) obj;
        return wj50.m88271j(this.f137531a, lwc0Var.f137531a) && wj50.m88271j(this.f137532b, lwc0Var.f137532b) && wj50.m88271j(this.f137533c, lwc0Var.f137533c) && wj50.m88271j(this.f137534d, lwc0Var.f137534d) && wj50.m88271j(this.f137535e, lwc0Var.f137535e) && wj50.m88271j(this.f137536f, lwc0Var.f137536f) && this.f137537g == lwc0Var.f137537g && this.f137538h.equals(lwc0Var.f137538h) && this.f137539i == lwc0Var.f137539i;
    }

    public final int hashCode() {
        int iHashCode = this.f137531a.hashCode() * 31;
        t0d0 t0d0Var = this.f137532b;
        int iHashCode2 = (iHashCode + (t0d0Var == null ? 0 : t0d0Var.hashCode())) * 31;
        String str = this.f137533c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137534d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f137535e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f137536f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        r891 r891Var = this.f137537g;
        int iM77244c = s571.m77244c((iHashCode6 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f137538h);
        int i = this.f137539i;
        return iM77244c + (i != 0 ? edb.m38547C(i) : 0);
    }
}
