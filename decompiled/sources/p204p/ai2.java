package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ai2 implements bi2 {

    /* JADX INFO: renamed from: a */
    public final String f15852a;

    /* JADX INFO: renamed from: b */
    public final String f15853b;

    /* JADX INFO: renamed from: c */
    public final Long f15854c;

    /* JADX INFO: renamed from: d */
    public final String f15855d;

    /* JADX INFO: renamed from: e */
    public final String f15856e;

    /* JADX INFO: renamed from: f */
    public final r891 f15857f;

    /* JADX INFO: renamed from: g */
    public final List f15858g;

    /* JADX INFO: renamed from: h */
    public final boolean f15859h;

    /* JADX INFO: renamed from: i */
    public final boolean f15860i;

    /* JADX INFO: renamed from: j */
    public final d850 f15861j;

    public ai2(String str, String str2, Long l, String str3, String str4, r891 r891Var, List list, boolean z, boolean z2, d850 d850Var) {
        this.f15852a = str;
        this.f15853b = str2;
        this.f15854c = l;
        this.f15855d = str3;
        this.f15856e = str4;
        this.f15857f = r891Var;
        this.f15858g = list;
        this.f15859h = z;
        this.f15860i = z2;
        this.f15861j = d850Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m26049a() {
        return this.f15853b;
    }

    /* JADX INFO: renamed from: b */
    public final List m26050b() {
        return this.f15858g;
    }

    /* JADX INFO: renamed from: c */
    public final String m26051c() {
        return this.f15855d;
    }

    /* JADX INFO: renamed from: d */
    public final String m26052d() {
        return this.f15856e;
    }

    /* JADX INFO: renamed from: e */
    public final Long m26053e() {
        return this.f15854c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        ai2 ai2Var = (ai2) obj;
        return wj50.m88271j(this.f15852a, ai2Var.f15852a) && wj50.m88271j(this.f15853b, ai2Var.f15853b) && wj50.m88271j(this.f15854c, ai2Var.f15854c) && wj50.m88271j(this.f15855d, ai2Var.f15855d) && wj50.m88271j(this.f15856e, ai2Var.f15856e) && this.f15857f == ai2Var.f15857f && wj50.m88271j(this.f15858g, ai2Var.f15858g) && this.f15859h == ai2Var.f15859h && this.f15860i == ai2Var.f15860i && wj50.m88271j(this.f15861j, ai2Var.f15861j);
    }

    /* JADX INFO: renamed from: f */
    public final r891 m26054f() {
        return this.f15857f;
    }

    /* JADX INFO: renamed from: g */
    public final String m26055g() {
        return this.f15852a;
    }

    public final int hashCode() {
        int iHashCode = this.f15852a.hashCode() * 31;
        String str = this.f15853b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f15854c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f15855d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15856e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r891 r891Var = this.f15857f;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77244c((iHashCode5 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f15858g), 31, this.f15859h), 31, this.f15860i);
        d850 d850Var = this.f15861j;
        return iM77245d + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
