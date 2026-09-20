package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class z6l implements b7l {

    /* JADX INFO: renamed from: a */
    public final String f279947a;

    /* JADX INFO: renamed from: b */
    public final List f279948b;

    /* JADX INFO: renamed from: c */
    public final xcl0 f279949c;

    /* JADX INFO: renamed from: d */
    public final boolean f279950d;

    /* JADX INFO: renamed from: e */
    public final String f279951e;

    /* JADX INFO: renamed from: f */
    public final String f279952f;

    /* JADX INFO: renamed from: g */
    public final Map f279953g;

    /* JADX INFO: renamed from: h */
    public final int f279954h;

    /* JADX INFO: renamed from: i */
    public final pla1 f279955i;

    /* JADX INFO: renamed from: j */
    public final boolean f279956j;

    public z6l(String str, List list, xcl0 xcl0Var, boolean z, String str2, String str3, Map map, int i, pla1 pla1Var, boolean z2) {
        this.f279947a = str;
        this.f279948b = list;
        this.f279949c = xcl0Var;
        this.f279950d = z;
        this.f279951e = str2;
        this.f279952f = str3;
        this.f279953g = map;
        this.f279954h = i;
        this.f279955i = pla1Var;
        this.f279956j = z2;
    }

    /* JADX INFO: renamed from: d */
    public static z6l m95509d(z6l z6lVar, List list, String str, String str2, Map map, int i, pla1 pla1Var, boolean z, int i2) {
        String str3 = z6lVar.f279947a;
        if ((i2 & 2) != 0) {
            list = z6lVar.f279948b;
        }
        List list2 = list;
        xcl0 xcl0Var = z6lVar.f279949c;
        boolean z2 = z6lVar.f279950d;
        if ((i2 & 16) != 0) {
            str = z6lVar.f279951e;
        }
        String str4 = str;
        if ((i2 & 32) != 0) {
            str2 = z6lVar.f279952f;
        }
        String str5 = str2;
        Map map2 = (i2 & 64) != 0 ? z6lVar.f279953g : map;
        int i3 = (i2 & 128) != 0 ? z6lVar.f279954h : i;
        pla1 pla1Var2 = (i2 & 256) != 0 ? z6lVar.f279955i : pla1Var;
        boolean z3 = (i2 & 512) != 0 ? z6lVar.f279956j : z;
        z6lVar.getClass();
        return new z6l(str3, list2, xcl0Var, z2, str4, str5, map2, i3, pla1Var2, z3);
    }

    @Override // p204p.b7l
    /* JADX INFO: renamed from: a */
    public final Map mo24969a() {
        return this.f279953g;
    }

    @Override // p204p.b7l
    /* JADX INFO: renamed from: b */
    public final String mo24970b() {
        return this.f279952f;
    }

    @Override // p204p.b7l
    /* JADX INFO: renamed from: c */
    public final String mo24971c() {
        return this.f279951e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6l)) {
            return false;
        }
        z6l z6lVar = (z6l) obj;
        return wj50.m88271j(this.f279947a, z6lVar.f279947a) && wj50.m88271j(this.f279948b, z6lVar.f279948b) && wj50.m88271j(this.f279949c, z6lVar.f279949c) && this.f279950d == z6lVar.f279950d && wj50.m88271j(this.f279951e, z6lVar.f279951e) && wj50.m88271j(this.f279952f, z6lVar.f279952f) && wj50.m88271j(this.f279953g, z6lVar.f279953g) && this.f279954h == z6lVar.f279954h && wj50.m88271j(this.f279955i, z6lVar.f279955i) && this.f279956j == z6lVar.f279956j;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f279949c.hashCode() + s571.m77244c(this.f279947a.hashCode() * 31, 31, this.f279948b)) * 31, 31, this.f279950d);
        String str = this.f279951e;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279952f;
        return Boolean.hashCode(this.f279956j) + ydj.m93448g(this.f279955i, f710.m40938f(this.f279954h, edb.m38557f((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f279953g), 31), 31);
    }
}
