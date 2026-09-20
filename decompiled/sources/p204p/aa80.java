package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class aa80 {

    /* JADX INFO: renamed from: a */
    public final oe70 f13784a;

    /* JADX INFO: renamed from: b */
    public final b450 f13785b;

    /* JADX INFO: renamed from: c */
    public final ibj f13786c;

    /* JADX INFO: renamed from: d */
    public final wr31 f13787d;

    /* JADX INFO: renamed from: e */
    public final List f13788e;

    /* JADX INFO: renamed from: f */
    public final boolean f13789f;

    /* JADX INFO: renamed from: g */
    public final List f13790g;

    public aa80(oe70 oe70Var, b450 b450Var, ibj ibjVar, wr31 wr31Var, List list, boolean z, List list2) {
        this.f13784a = oe70Var;
        this.f13785b = b450Var;
        this.f13786c = ibjVar;
        this.f13787d = wr31Var;
        this.f13788e = list;
        this.f13789f = z;
        this.f13790g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa80)) {
            return false;
        }
        aa80 aa80Var = (aa80) obj;
        return wj50.m88271j(this.f13784a, aa80Var.f13784a) && wj50.m88271j(this.f13785b, aa80Var.f13785b) && wj50.m88271j(this.f13786c, aa80Var.f13786c) && this.f13787d == aa80Var.f13787d && wj50.m88271j(this.f13788e, aa80Var.f13788e) && this.f13789f == aa80Var.f13789f && wj50.m88271j(this.f13790g, aa80Var.f13790g);
    }

    public final int hashCode() {
        return this.f13790g.hashCode() + s571.m77245d(s571.m77244c((this.f13787d.hashCode() + ((this.f13786c.hashCode() + stz0.m79353g(this.f13784a.hashCode() * 31, 31, this.f13785b)) * 31)) * 31, 31, this.f13788e), 31, this.f13789f);
    }
}
