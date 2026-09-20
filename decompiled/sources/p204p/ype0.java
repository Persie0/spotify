package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ype0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f274921a;

    /* JADX INFO: renamed from: b */
    public final String f274922b;

    /* JADX INFO: renamed from: c */
    public final String f274923c;

    /* JADX INFO: renamed from: d */
    public final String f274924d;

    /* JADX INFO: renamed from: e */
    public final String f274925e;

    /* JADX INFO: renamed from: f */
    public final List f274926f;

    /* JADX INFO: renamed from: g */
    public final int f274927g;

    /* JADX INFO: renamed from: h */
    public final Boolean f274928h;

    /* JADX INFO: renamed from: i */
    public final String f274929i;

    public ype0(String str, String str2, String str3, String str4, String str5, List list, int i, Boolean bool, String str6) {
        this.f274921a = str;
        this.f274922b = str2;
        this.f274923c = str3;
        this.f274924d = str4;
        this.f274925e = str5;
        this.f274926f = list;
        this.f274927g = i;
        this.f274928h = bool;
        this.f274929i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ype0)) {
            return false;
        }
        ype0 ype0Var = (ype0) obj;
        return wj50.m88271j(this.f274921a, ype0Var.f274921a) && wj50.m88271j(this.f274922b, ype0Var.f274922b) && this.f274923c.equals(ype0Var.f274923c) && this.f274924d.equals(ype0Var.f274924d) && this.f274925e.equals(ype0Var.f274925e) && wj50.m88271j(this.f274926f, ype0Var.f274926f) && this.f274927g == ype0Var.f274927g && wj50.m88271j(this.f274928h, ype0Var.f274928h) && wj50.m88271j(this.f274929i, ype0Var.f274929i);
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f274921a;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f274927g, s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f274921a.hashCode() * 31, 31, this.f274922b), 31, this.f274923c), 31, this.f274924d), 31, this.f274925e), 31, this.f274926f), 31);
        Boolean bool = this.f274928h;
        int iHashCode = (iM62800g + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f274929i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
