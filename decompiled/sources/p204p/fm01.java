package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fm01 {

    /* JADX INFO: renamed from: a */
    public final float f70902a;

    /* JADX INFO: renamed from: b */
    public final em01 f70903b;

    /* JADX INFO: renamed from: c */
    public final boolean f70904c;

    /* JADX INFO: renamed from: d */
    public final eh00 f70905d;

    /* JADX INFO: renamed from: e */
    public final boolean f70906e;

    /* JADX INFO: renamed from: f */
    public final boolean f70907f;

    /* JADX INFO: renamed from: g */
    public final boolean f70908g;

    /* JADX INFO: renamed from: h */
    public final am01 f70909h;

    /* JADX INFO: renamed from: i */
    public final jkw0 f70910i;

    /* JADX INFO: renamed from: j */
    public final pck f70911j;

    /* JADX INFO: renamed from: k */
    public final boolean f70912k;

    /* JADX INFO: renamed from: l */
    public final List f70913l;

    /* JADX INFO: renamed from: m */
    public final List f70914m;

    public fm01(float f, em01 em01Var, boolean z, eh00 eh00Var, boolean z2, boolean z3, boolean z4, am01 am01Var, jkw0 jkw0Var, pck pckVar, boolean z5, List list, List list2) {
        this.f70902a = f;
        this.f70903b = em01Var;
        this.f70904c = z;
        this.f70905d = eh00Var;
        this.f70906e = z2;
        this.f70907f = z3;
        this.f70908g = z4;
        this.f70909h = am01Var;
        this.f70910i = jkw0Var;
        this.f70911j = pckVar;
        this.f70912k = z5;
        this.f70913l = list;
        this.f70914m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm01)) {
            return false;
        }
        fm01 fm01Var = (fm01) obj;
        return ybs.m93301b(this.f70902a, fm01Var.f70902a) && this.f70903b.equals(fm01Var.f70903b) && this.f70904c == fm01Var.f70904c && wj50.m88271j(this.f70905d, fm01Var.f70905d) && this.f70906e == fm01Var.f70906e && this.f70907f == fm01Var.f70907f && this.f70908g == fm01Var.f70908g && this.f70909h.equals(fm01Var.f70909h) && this.f70910i.equals(fm01Var.f70910i) && this.f70911j.equals(fm01Var.f70911j) && this.f70912k == fm01Var.f70912k && wj50.m88271j(this.f70913l, fm01Var.f70913l) && this.f70914m.equals(fm01Var.f70914m);
    }

    public final int hashCode() {
        return this.f70914m.hashCode() + s571.m77244c(s571.m77245d((this.f70911j.hashCode() + ((this.f70910i.hashCode() + ((this.f70909h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(p1v.m68853j(s571.m77245d((this.f70903b.hashCode() + (Float.hashCode(this.f70902a) * 31)) * 31, 31, this.f70904c), this.f70905d, 31), 31, this.f70906e), 31, this.f70907f), 31, this.f70908g)) * 31)) * 31)) * 31, 31, this.f70912k), 31, this.f70913l);
    }
}
