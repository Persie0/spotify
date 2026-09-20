package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wv91 {

    /* JADX INFO: renamed from: a */
    public final aey0 f255439a;

    /* JADX INFO: renamed from: b */
    public final s6j0 f255440b;

    /* JADX INFO: renamed from: c */
    public s6j0 f255441c;

    /* JADX INFO: renamed from: d */
    public final b3j0 f255442d;

    /* JADX INFO: renamed from: e */
    public final List f255443e;

    /* JADX INFO: renamed from: f */
    public final List f255444f;

    /* JADX INFO: renamed from: g */
    public final Long f255445g;

    /* JADX INFO: renamed from: h */
    public final Map f255446h;

    /* JADX INFO: renamed from: i */
    public final String f255447i;

    /* JADX INFO: renamed from: j */
    public final zs91 f255448j;

    public wv91(aey0 aey0Var, s6j0 s6j0Var, s6j0 s6j0Var2, b3j0 b3j0Var, List list, List list2, Long l, LinkedHashMap linkedHashMap, String str, zs91 zs91Var) {
        this.f255439a = aey0Var;
        this.f255440b = s6j0Var;
        this.f255441c = s6j0Var2;
        this.f255442d = b3j0Var;
        this.f255443e = list;
        this.f255444f = list2;
        this.f255445g = l;
        this.f255446h = linkedHashMap;
        this.f255447i = str;
        this.f255448j = zs91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv91)) {
            return false;
        }
        wv91 wv91Var = (wv91) obj;
        return this.f255439a == wv91Var.f255439a && wj50.m88271j(this.f255440b, wv91Var.f255440b) && wj50.m88271j(this.f255441c, wv91Var.f255441c) && wj50.m88271j(this.f255442d, wv91Var.f255442d) && wj50.m88271j(this.f255443e, wv91Var.f255443e) && wj50.m88271j(this.f255444f, wv91Var.f255444f) && wj50.m88271j(this.f255445g, wv91Var.f255445g) && wj50.m88271j(this.f255446h, wv91Var.f255446h) && wj50.m88271j(this.f255447i, wv91Var.f255447i) && wj50.m88271j(this.f255448j, wv91Var.f255448j);
    }

    public final int hashCode() {
        int iHashCode = (this.f255440b.hashCode() + (this.f255439a.hashCode() * 31)) * 31;
        s6j0 s6j0Var = this.f255441c;
        int iM77244c = s571.m77244c(s571.m77244c((this.f255442d.hashCode() + ((iHashCode + (s6j0Var == null ? 0 : s6j0Var.hashCode())) * 31)) * 31, 31, this.f255443e), 31, this.f255444f);
        Long l = this.f255445g;
        int iHashCode2 = (iM77244c + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.f255446h;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f255447i;
        return this.f255448j.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
