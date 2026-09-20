package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ks81 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f125869a;

    /* JADX INFO: renamed from: b */
    public final String f125870b;

    /* JADX INFO: renamed from: c */
    public final wzk f125871c;

    /* JADX INFO: renamed from: d */
    public final int f125872d;

    /* JADX INFO: renamed from: e */
    public final String f125873e;

    /* JADX INFO: renamed from: f */
    public final boolean f125874f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f125875g;

    /* JADX INFO: renamed from: h */
    public final String f125876h;

    /* JADX INFO: renamed from: i */
    public final String f125877i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f125878j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f125879k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f125880l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f125881m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f125882n;

    /* JADX INFO: renamed from: o */
    public final Integer f125883o;

    /* JADX INFO: renamed from: p */
    public final Integer f125884p;

    /* JADX INFO: renamed from: q */
    public final String f125885q;

    /* JADX INFO: renamed from: r */
    public final String f125886r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f125887s;

    public ks81(String str, String str2, wzk wzkVar, int i, String str3, boolean z, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, Integer num, Integer num2, String str6, String str7, ArrayList arrayList7) {
        this.f125869a = str;
        this.f125870b = str2;
        this.f125871c = wzkVar;
        this.f125872d = i;
        this.f125873e = str3;
        this.f125874f = z;
        this.f125875g = arrayList;
        this.f125876h = str4;
        this.f125877i = str5;
        this.f125878j = arrayList2;
        this.f125879k = arrayList3;
        this.f125880l = arrayList4;
        this.f125881m = arrayList5;
        this.f125882n = arrayList6;
        this.f125883o = num;
        this.f125884p = num2;
        this.f125885q = str6;
        this.f125886r = str7;
        this.f125887s = arrayList7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks81)) {
            return false;
        }
        ks81 ks81Var = (ks81) obj;
        return this.f125869a.equals(ks81Var.f125869a) && wj50.m88271j(this.f125870b, ks81Var.f125870b) && this.f125871c.equals(ks81Var.f125871c) && this.f125872d == ks81Var.f125872d && this.f125873e.equals(ks81Var.f125873e) && this.f125874f == ks81Var.f125874f && this.f125875g.equals(ks81Var.f125875g) && this.f125876h.equals(ks81Var.f125876h) && wj50.m88271j(this.f125877i, ks81Var.f125877i) && this.f125878j.equals(ks81Var.f125878j) && this.f125879k.equals(ks81Var.f125879k) && this.f125880l.equals(ks81Var.f125880l) && this.f125881m.equals(ks81Var.f125881m) && this.f125882n.equals(ks81Var.f125882n) && wj50.m88271j(this.f125883o, ks81Var.f125883o) && wj50.m88271j(this.f125884p, ks81Var.f125884p) && wj50.m88271j(this.f125885q, ks81Var.f125885q) && wj50.m88271j(this.f125886r, ks81Var.f125886r) && this.f125887s.equals(ks81Var.f125887s);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f125882n, lq51.m59700f(this.f125881m, lq51.m59700f(this.f125880l, lq51.m59700f(this.f125879k, lq51.m59700f(this.f125878j, s571.m77243b(s571.m77243b(lq51.m59700f(this.f125875g, s571.m77245d(s571.m77243b(mt60.m62800g(this.f125872d, (this.f125871c.hashCode() + s571.m77243b(this.f125869a.hashCode() * 31, 31, this.f125870b)) * 31, 31), 31, this.f125873e), 31, this.f125874f), 31), 31, this.f125876h), 31, this.f125877i), 31), 31), 31), 31), 31);
        Integer num = this.f125883o;
        int iHashCode = (iM59700f + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f125884p;
        return this.f125887s.hashCode() + s571.m77243b(s571.m77243b((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f125885q), 31, this.f125886r);
    }
}
