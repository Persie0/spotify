package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xqx0 {

    /* JADX INFO: renamed from: a */
    public final String f265136a;

    /* JADX INFO: renamed from: b */
    public final b171 f265137b;

    /* JADX INFO: renamed from: c */
    public final sy30 f265138c;

    /* JADX INFO: renamed from: d */
    public final j0k f265139d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f265140e;

    /* JADX INFO: renamed from: f */
    public final elo0 f265141f;

    /* JADX INFO: renamed from: g */
    public final boolean f265142g;

    /* JADX INFO: renamed from: h */
    public final sck0 f265143h;

    /* JADX INFO: renamed from: i */
    public final bx51 f265144i;

    public xqx0(String str, b171 b171Var, sy30 sy30Var, j0k j0kVar, ArrayList arrayList, elo0 elo0Var, boolean z, sck0 sck0Var, bx51 bx51Var) {
        this.f265136a = str;
        this.f265137b = b171Var;
        this.f265138c = sy30Var;
        this.f265139d = j0kVar;
        this.f265140e = arrayList;
        this.f265141f = elo0Var;
        this.f265142g = z;
        this.f265143h = sck0Var;
        this.f265144i = bx51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqx0)) {
            return false;
        }
        xqx0 xqx0Var = (xqx0) obj;
        return wj50.m88271j(this.f265136a, xqx0Var.f265136a) && this.f265137b.equals(xqx0Var.f265137b) && this.f265138c.equals(xqx0Var.f265138c) && this.f265139d.equals(xqx0Var.f265139d) && this.f265140e.equals(xqx0Var.f265140e) && wj50.m88271j(this.f265141f, xqx0Var.f265141f) && this.f265142g == xqx0Var.f265142g && wj50.m88271j(this.f265143h, xqx0Var.f265143h) && wj50.m88271j(this.f265144i, xqx0Var.f265144i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f265141f.hashCode() + lq51.m59700f(this.f265140e, (this.f265139d.hashCode() + ((this.f265138c.hashCode() + ((this.f265137b.hashCode() + (this.f265136a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31, this.f265142g);
        sck0 sck0Var = this.f265143h;
        int iHashCode = (iM77245d + (sck0Var == null ? 0 : sck0Var.hashCode())) * 31;
        bx51 bx51Var = this.f265144i;
        return iHashCode + (bx51Var != null ? bx51Var.hashCode() : 0);
    }
}
