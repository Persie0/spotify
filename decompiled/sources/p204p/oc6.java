package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oc6 {

    /* JADX INFO: renamed from: a */
    public final zzb f163817a;

    /* JADX INFO: renamed from: b */
    public final fg6 f163818b;

    /* JADX INFO: renamed from: c */
    public final int f163819c;

    /* JADX INFO: renamed from: d */
    public final List f163820d;

    /* JADX INFO: renamed from: e */
    public final List f163821e;

    /* JADX INFO: renamed from: f */
    public final boolean f163822f;

    /* JADX INFO: renamed from: g */
    public final bep0 f163823g;

    /* JADX INFO: renamed from: h */
    public final boolean f163824h;

    /* JADX INFO: renamed from: i */
    public final boolean f163825i;

    /* JADX INFO: renamed from: j */
    public final boolean f163826j;

    /* JADX INFO: renamed from: k */
    public final boolean f163827k;

    /* JADX INFO: renamed from: l */
    public final boolean f163828l;

    /* JADX INFO: renamed from: m */
    public final boolean f163829m;

    /* JADX INFO: renamed from: n */
    public final w1m0 f163830n;

    /* JADX INFO: renamed from: o */
    public final gh00 f163831o;

    public oc6(zzb zzbVar, fg6 fg6Var, int i, List list, List list2, boolean z, bep0 bep0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, w1m0 w1m0Var, gh00 gh00Var) {
        this.f163817a = zzbVar;
        this.f163818b = fg6Var;
        this.f163819c = i;
        this.f163820d = list;
        this.f163821e = list2;
        this.f163822f = z;
        this.f163823g = bep0Var;
        this.f163824h = z2;
        this.f163825i = z3;
        this.f163826j = z4;
        this.f163827k = z5;
        this.f163828l = z6;
        this.f163829m = z7;
        this.f163830n = w1m0Var;
        this.f163831o = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc6)) {
            return false;
        }
        oc6 oc6Var = (oc6) obj;
        return wj50.m88271j(this.f163817a, oc6Var.f163817a) && this.f163818b == oc6Var.f163818b && this.f163819c == oc6Var.f163819c && wj50.m88271j(this.f163820d, oc6Var.f163820d) && this.f163821e.equals(oc6Var.f163821e) && this.f163822f == oc6Var.f163822f && wj50.m88271j(this.f163823g, oc6Var.f163823g) && this.f163824h == oc6Var.f163824h && this.f163825i == oc6Var.f163825i && this.f163826j == oc6Var.f163826j && this.f163827k == oc6Var.f163827k && this.f163828l == oc6Var.f163828l && this.f163829m == oc6Var.f163829m && this.f163830n.equals(oc6Var.f163830n) && wj50.m88271j(this.f163831o, oc6Var.f163831o);
    }

    public final int hashCode() {
        return this.f163831o.hashCode() + ((this.f163830n.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f163823g.hashCode() + s571.m77245d(s571.m77244c(s571.m77244c(mt60.m62800g(this.f163819c, (this.f163818b.hashCode() + (this.f163817a.hashCode() * 31)) * 31, 31), 31, this.f163820d), 31, this.f163821e), 31, this.f163822f)) * 31, 31, this.f163824h), 31, this.f163825i), 31, this.f163826j), 31, this.f163827k), 31, this.f163828l), 31, this.f163829m)) * 31);
    }
}
