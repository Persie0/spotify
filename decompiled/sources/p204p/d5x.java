package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d5x {

    /* JADX INFO: renamed from: a */
    public final l5x f45514a;

    /* JADX INFO: renamed from: b */
    public final List f45515b;

    /* JADX INFO: renamed from: c */
    public final List f45516c;

    /* JADX INFO: renamed from: d */
    public final boolean f45517d;

    /* JADX INFO: renamed from: e */
    public final boolean f45518e;

    /* JADX INFO: renamed from: f */
    public final String f45519f;

    /* JADX INFO: renamed from: g */
    public final y0k0 f45520g;

    /* JADX INFO: renamed from: h */
    public final d2k0 f45521h;

    /* JADX INFO: renamed from: i */
    public final e4k0 f45522i;

    /* JADX INFO: renamed from: j */
    public final boolean f45523j;

    /* JADX INFO: renamed from: k */
    public final stf1 f45524k;

    /* JADX INFO: renamed from: l */
    public final huf1 f45525l;

    /* JADX INFO: renamed from: m */
    public final int f45526m;

    /* JADX INFO: renamed from: n */
    public final Long f45527n;

    public d5x(l5x l5xVar, List list, List list2, boolean z, boolean z2, String str, y0k0 y0k0Var, d2k0 d2k0Var, e4k0 e4k0Var, boolean z3, stf1 stf1Var, huf1 huf1Var, int i, Long l) {
        this.f45514a = l5xVar;
        this.f45515b = list;
        this.f45516c = list2;
        this.f45517d = z;
        this.f45518e = z2;
        this.f45519f = str;
        this.f45520g = y0k0Var;
        this.f45521h = d2k0Var;
        this.f45522i = e4k0Var;
        this.f45523j = z3;
        this.f45524k = stf1Var;
        this.f45525l = huf1Var;
        this.f45526m = i;
        this.f45527n = l;
    }

    /* JADX INFO: renamed from: a */
    public static d5x m35034a(d5x d5xVar, l5x l5xVar, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, String str, y0k0 y0k0Var, d2k0 d2k0Var, e4k0 e4k0Var, boolean z3, stf1 stf1Var, huf1 huf1Var, int i, Long l, int i2) {
        l5x l5xVar2 = (i2 & 1) != 0 ? d5xVar.f45514a : l5xVar;
        List list = (i2 & 2) != 0 ? d5xVar.f45515b : arrayList;
        List list2 = (i2 & 4) != 0 ? d5xVar.f45516c : arrayList2;
        boolean z4 = (i2 & 8) != 0 ? d5xVar.f45517d : z;
        boolean z5 = (i2 & 16) != 0 ? d5xVar.f45518e : z2;
        String str2 = (i2 & 32) != 0 ? d5xVar.f45519f : str;
        y0k0 y0k0Var2 = (i2 & 64) != 0 ? d5xVar.f45520g : y0k0Var;
        d2k0 d2k0Var2 = (i2 & 128) != 0 ? d5xVar.f45521h : d2k0Var;
        e4k0 e4k0Var2 = (i2 & 256) != 0 ? d5xVar.f45522i : e4k0Var;
        boolean z6 = (i2 & 512) != 0 ? d5xVar.f45523j : z3;
        stf1 stf1Var2 = (i2 & 1024) != 0 ? d5xVar.f45524k : stf1Var;
        huf1 huf1Var2 = (i2 & 2048) != 0 ? d5xVar.f45525l : huf1Var;
        int i3 = (i2 & 4096) != 0 ? d5xVar.f45526m : i;
        Long l2 = (i2 & 8192) != 0 ? d5xVar.f45527n : l;
        d5xVar.getClass();
        return new d5x(l5xVar2, list, list2, z4, z5, str2, y0k0Var2, d2k0Var2, e4k0Var2, z6, stf1Var2, huf1Var2, i3, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5x)) {
            return false;
        }
        d5x d5xVar = (d5x) obj;
        return wj50.m88271j(this.f45514a, d5xVar.f45514a) && wj50.m88271j(this.f45515b, d5xVar.f45515b) && wj50.m88271j(this.f45516c, d5xVar.f45516c) && this.f45517d == d5xVar.f45517d && this.f45518e == d5xVar.f45518e && wj50.m88271j(this.f45519f, d5xVar.f45519f) && wj50.m88271j(this.f45520g, d5xVar.f45520g) && wj50.m88271j(this.f45521h, d5xVar.f45521h) && wj50.m88271j(this.f45522i, d5xVar.f45522i) && this.f45523j == d5xVar.f45523j && wj50.m88271j(this.f45524k, d5xVar.f45524k) && wj50.m88271j(this.f45525l, d5xVar.f45525l) && this.f45526m == d5xVar.f45526m && wj50.m88271j(this.f45527n, d5xVar.f45527n);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77244c(s571.m77244c(this.f45514a.hashCode() * 31, 31, this.f45515b), 31, this.f45516c), 31, this.f45517d), 31, this.f45518e);
        String str = this.f45519f;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        y0k0 y0k0Var = this.f45520g;
        int iM62800g = mt60.m62800g(this.f45526m, (this.f45525l.hashCode() + ((this.f45524k.hashCode() + s571.m77245d((this.f45522i.hashCode() + ((this.f45521h.hashCode() + ((iHashCode + (y0k0Var == null ? 0 : y0k0Var.hashCode())) * 31)) * 31)) * 31, 31, this.f45523j)) * 31)) * 31, 31);
        Long l = this.f45527n;
        return iM62800g + (l != null ? l.hashCode() : 0);
    }
}
