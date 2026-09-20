package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h8v0 {

    /* JADX INFO: renamed from: a */
    public final List f88807a;

    /* JADX INFO: renamed from: b */
    public final int f88808b;

    /* JADX INFO: renamed from: c */
    public final int f88809c;

    /* JADX INFO: renamed from: d */
    public final List f88810d;

    /* JADX INFO: renamed from: e */
    public final pxj f88811e;

    /* JADX INFO: renamed from: f */
    public final s4v0 f88812f;

    /* JADX INFO: renamed from: g */
    public final fte f88813g;

    /* JADX INFO: renamed from: h */
    public final fte f88814h;

    /* JADX INFO: renamed from: i */
    public final boolean f88815i;

    /* JADX INFO: renamed from: j */
    public final List f88816j;

    /* JADX INFO: renamed from: k */
    public final boolean f88817k;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h8v0(int i, b450 b450Var) {
        b450Var = (i & 64) != 0 ? null : b450Var;
        lau lauVar = lau.f131415a;
        this(lauVar, 0, 0, lauVar, null, null, b450Var, null, false, lauVar, false);
    }

    /* JADX INFO: renamed from: a */
    public static h8v0 m46851a(h8v0 h8v0Var, List list, int i, int i2, List list2, pxj pxjVar, s4v0 s4v0Var, b450 b450Var, boolean z, List list3, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            list = h8v0Var.f88807a;
        }
        List list4 = list;
        if ((i3 & 2) != 0) {
            i = h8v0Var.f88808b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = h8v0Var.f88809c;
        }
        int i5 = i2;
        List list5 = (i3 & 8) != 0 ? h8v0Var.f88810d : list2;
        pxj pxjVar2 = (i3 & 16) != 0 ? h8v0Var.f88811e : pxjVar;
        s4v0 s4v0Var2 = (i3 & 32) != 0 ? h8v0Var.f88812f : s4v0Var;
        fte fteVar = (i3 & 64) != 0 ? h8v0Var.f88813g : b450Var;
        fte fteVar2 = h8v0Var.f88814h;
        boolean z3 = (i3 & 256) != 0 ? h8v0Var.f88815i : z;
        List list6 = (i3 & 512) != 0 ? h8v0Var.f88816j : list3;
        boolean z4 = (i3 & 1024) != 0 ? h8v0Var.f88817k : z2;
        h8v0Var.getClass();
        return new h8v0(list4, i4, i5, list5, pxjVar2, s4v0Var2, fteVar, fteVar2, z3, list6, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8v0)) {
            return false;
        }
        h8v0 h8v0Var = (h8v0) obj;
        return wj50.m88271j(this.f88807a, h8v0Var.f88807a) && this.f88808b == h8v0Var.f88808b && this.f88809c == h8v0Var.f88809c && wj50.m88271j(this.f88810d, h8v0Var.f88810d) && this.f88811e == h8v0Var.f88811e && this.f88812f == h8v0Var.f88812f && wj50.m88271j(this.f88813g, h8v0Var.f88813g) && wj50.m88271j(this.f88814h, h8v0Var.f88814h) && this.f88815i == h8v0Var.f88815i && wj50.m88271j(this.f88816j, h8v0Var.f88816j) && this.f88817k == h8v0Var.f88817k;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(mt60.m62800g(this.f88809c, mt60.m62800g(this.f88808b, this.f88807a.hashCode() * 31, 31), 31), 31, this.f88810d);
        pxj pxjVar = this.f88811e;
        int iHashCode = (iM77244c + (pxjVar == null ? 0 : pxjVar.hashCode())) * 31;
        s4v0 s4v0Var = this.f88812f;
        int iHashCode2 = (iHashCode + (s4v0Var == null ? 0 : s4v0Var.hashCode())) * 31;
        fte fteVar = this.f88813g;
        int iHashCode3 = (iHashCode2 + (fteVar == null ? 0 : fteVar.hashCode())) * 31;
        fte fteVar2 = this.f88814h;
        return Boolean.hashCode(this.f88817k) + s571.m77244c(s571.m77245d((iHashCode3 + (fteVar2 != null ? fteVar2.hashCode() : 0)) * 31, 31, this.f88815i), 31, this.f88816j);
    }

    public h8v0(List list, int i, int i2, List list2, pxj pxjVar, s4v0 s4v0Var, fte fteVar, fte fteVar2, boolean z, List list3, boolean z2) {
        this.f88807a = list;
        this.f88808b = i;
        this.f88809c = i2;
        this.f88810d = list2;
        this.f88811e = pxjVar;
        this.f88812f = s4v0Var;
        this.f88813g = fteVar;
        this.f88814h = fteVar2;
        this.f88815i = z;
        this.f88816j = list3;
        this.f88817k = z2;
    }
}
