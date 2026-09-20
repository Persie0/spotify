package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zrp0 {

    /* JADX INFO: renamed from: a */
    public final jsp0 f285717a;

    /* JADX INFO: renamed from: b */
    public final pck f285718b;

    /* JADX INFO: renamed from: c */
    public final boolean f285719c;

    /* JADX INFO: renamed from: d */
    public final boolean f285720d;

    /* JADX INFO: renamed from: e */
    public final boolean f285721e;

    /* JADX INFO: renamed from: f */
    public final List f285722f;

    /* JADX INFO: renamed from: g */
    public final eh00 f285723g;

    /* JADX INFO: renamed from: h */
    public final boolean f285724h;

    /* JADX INFO: renamed from: i */
    public final tpk0 f285725i;

    public zrp0(jsp0 jsp0Var, pck pckVar, boolean z, boolean z2, boolean z3, List list, eh00 eh00Var, boolean z4, tpk0 tpk0Var) {
        this.f285717a = jsp0Var;
        this.f285718b = pckVar;
        this.f285719c = z;
        this.f285720d = z2;
        this.f285721e = z3;
        this.f285722f = list;
        this.f285723g = eh00Var;
        this.f285724h = z4;
        this.f285725i = tpk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrp0)) {
            return false;
        }
        zrp0 zrp0Var = (zrp0) obj;
        return this.f285717a.equals(zrp0Var.f285717a) && this.f285718b.equals(zrp0Var.f285718b) && this.f285719c == zrp0Var.f285719c && this.f285720d == zrp0Var.f285720d && this.f285721e == zrp0Var.f285721e && wj50.m88271j(this.f285722f, zrp0Var.f285722f) && wj50.m88271j(this.f285723g, zrp0Var.f285723g) && this.f285724h == zrp0Var.f285724h && this.f285725i.equals(zrp0Var.f285725i);
    }

    public final int hashCode() {
        return this.f285725i.hashCode() + s571.m77245d(p1v.m68853j(s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d((this.f285718b.hashCode() + (this.f285717a.hashCode() * 31)) * 31, 31, this.f285719c), 31, this.f285720d), 31, this.f285721e), 31, this.f285722f), this.f285723g, 31), 31, this.f285724h);
    }
}
