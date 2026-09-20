package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tl11 implements ew50 {

    /* JADX INFO: renamed from: a */
    public final xj11 f221296a;

    /* JADX INFO: renamed from: b */
    public final List f221297b;

    /* JADX INFO: renamed from: c */
    public final boolean f221298c;

    /* JADX INFO: renamed from: d */
    public final int f221299d;

    /* JADX INFO: renamed from: e */
    public final int f221300e;

    /* JADX INFO: renamed from: f */
    public final m3w f221301f;

    /* JADX INFO: renamed from: g */
    public final pbk f221302g;

    /* JADX INFO: renamed from: h */
    public final tnl0 f221303h;

    /* JADX INFO: renamed from: i */
    public final zv81 f221304i;

    /* JADX INFO: renamed from: j */
    public final bkj0 f221305j;

    public tl11(xj11 xj11Var, List list, boolean z, int i, int i2, m3w m3wVar, pbk pbkVar, tnl0 tnl0Var, zv81 zv81Var, bkj0 bkj0Var) {
        this.f221296a = xj11Var;
        this.f221297b = list;
        this.f221298c = z;
        this.f221299d = i;
        this.f221300e = i2;
        this.f221301f = m3wVar;
        this.f221302g = pbkVar;
        this.f221303h = tnl0Var;
        this.f221304i = zv81Var;
        this.f221305j = bkj0Var;
    }

    /* JADX INFO: renamed from: a */
    public static tl11 m81029a(tl11 tl11Var, List list, m3w m3wVar, int i) {
        xj11 xj11Var = tl11Var.f221296a;
        if ((i & 2) != 0) {
            list = tl11Var.f221297b;
        }
        List list2 = list;
        boolean z = tl11Var.f221298c;
        int i2 = tl11Var.f221299d;
        int i3 = tl11Var.f221300e;
        if ((i & 32) != 0) {
            m3wVar = tl11Var.f221301f;
        }
        pbk pbkVar = tl11Var.f221302g;
        tnl0 tnl0Var = tl11Var.f221303h;
        zv81 zv81Var = tl11Var.f221304i;
        bkj0 bkj0Var = tl11Var.f221305j;
        tl11Var.getClass();
        return new tl11(xj11Var, list2, z, i2, i3, m3wVar, pbkVar, tnl0Var, zv81Var, bkj0Var);
    }

    /* JADX INFO: renamed from: b */
    public final xj11 m81030b() {
        return this.f221296a;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: c */
    public final boolean mo38623c() {
        return this.f221298c;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: d */
    public final int mo38624d() {
        return this.f221300e;
    }

    @Override // p204p.ew50
    /* JADX INFO: renamed from: e */
    public final int mo38625e() {
        return this.f221299d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl11)) {
            return false;
        }
        tl11 tl11Var = (tl11) obj;
        return wj50.m88271j(this.f221296a, tl11Var.f221296a) && wj50.m88271j(this.f221297b, tl11Var.f221297b) && this.f221298c == tl11Var.f221298c && this.f221299d == tl11Var.f221299d && this.f221300e == tl11Var.f221300e && wj50.m88271j(this.f221301f, tl11Var.f221301f) && wj50.m88271j(this.f221302g, tl11Var.f221302g) && wj50.m88271j(this.f221303h, tl11Var.f221303h) && wj50.m88271j(this.f221304i, tl11Var.f221304i) && wj50.m88271j(this.f221305j, tl11Var.f221305j);
    }

    @Override // p204p.ew50
    public final List getItems() {
        return this.f221297b;
    }

    public final int hashCode() {
        int iHashCode = (this.f221301f.hashCode() + mt60.m62800g(this.f221300e, mt60.m62800g(this.f221299d, s571.m77245d(s571.m77244c(this.f221296a.hashCode() * 31, 31, this.f221297b), 31, this.f221298c), 31), 31)) * 31;
        pbk pbkVar = this.f221302g;
        int iHashCode2 = (iHashCode + (pbkVar == null ? 0 : pbkVar.hashCode())) * 31;
        tnl0 tnl0Var = this.f221303h;
        int iHashCode3 = (iHashCode2 + (tnl0Var == null ? 0 : Integer.hashCode(tnl0Var.f222001a))) * 31;
        zv81 zv81Var = this.f221304i;
        int iHashCode4 = (iHashCode3 + (zv81Var == null ? 0 : zv81Var.hashCode())) * 31;
        bkj0 bkj0Var = this.f221305j;
        return iHashCode4 + (bkj0Var != null ? bkj0Var.hashCode() : 0);
    }
}
