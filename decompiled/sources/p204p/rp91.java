package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rp91 {

    /* JADX INFO: renamed from: a */
    public final if71 f201473a;

    /* JADX INFO: renamed from: b */
    public final if71 f201474b;

    /* JADX INFO: renamed from: c */
    public final if71 f201475c;

    /* JADX INFO: renamed from: d */
    public final if71 f201476d;

    /* JADX INFO: renamed from: e */
    public final if71 f201477e;

    /* JADX INFO: renamed from: f */
    public final if71 f201478f;

    /* JADX INFO: renamed from: g */
    public final if71 f201479g;

    public rp91() {
        if71 if71Var = tp91.f222464a;
        if71 if71Var2 = tp91.f222465b;
        if71 if71Var3 = tp91.f222466c;
        if71 if71Var4 = tp91.f222467d;
        if71 if71Var5 = tp91.f222468e;
        if71 if71Var6 = tp91.f222469f;
        if71 if71Var7 = tp91.f222470g;
        dk80 dk80Var = vp91.f243636b;
        this.f201473a = if71Var;
        this.f201474b = if71Var2;
        this.f201475c = if71Var3;
        this.f201476d = if71Var4;
        this.f201477e = if71Var5;
        this.f201478f = if71Var6;
        this.f201479g = if71Var7;
    }

    /* JADX INFO: renamed from: a */
    public final if71 m76102a() {
        return this.f201478f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp91)) {
            return false;
        }
        rp91 rp91Var = (rp91) obj;
        return wj50.m88271j(this.f201473a, rp91Var.f201473a) && wj50.m88271j(this.f201474b, rp91Var.f201474b) && wj50.m88271j(this.f201475c, rp91Var.f201475c) && wj50.m88271j(this.f201476d, rp91Var.f201476d) && wj50.m88271j(this.f201477e, rp91Var.f201477e) && wj50.m88271j(this.f201478f, rp91Var.f201478f) && wj50.m88271j(this.f201479g, rp91Var.f201479g);
    }

    public final int hashCode() {
        return this.f201479g.hashCode() + lq51.m59701g(this.f201478f, lq51.m59701g(this.f201477e, lq51.m59701g(this.f201476d, lq51.m59701g(this.f201475c, lq51.m59701g(this.f201474b, this.f201473a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(titleLarge=" + this.f201473a + ", titleMedium=" + this.f201474b + ", titleSmall=" + this.f201475c + ", bodyLarge=" + this.f201476d + ", bodyMedium=" + this.f201477e + ", bodySmall=" + this.f201478f + ", caption=" + this.f201479g + ")";
    }
}
