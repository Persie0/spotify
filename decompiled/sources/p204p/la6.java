package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class la6 {

    /* JADX INFO: renamed from: a */
    public final boolean f131265a;

    /* JADX INFO: renamed from: b */
    public final is31 f131266b;

    /* JADX INFO: renamed from: c */
    public final boolean f131267c;

    /* JADX INFO: renamed from: d */
    public final boolean f131268d;

    /* JADX INFO: renamed from: e */
    public final String f131269e;

    /* JADX INFO: renamed from: f */
    public final boolean f131270f;

    /* JADX INFO: renamed from: g */
    public final boolean f131271g;

    /* JADX INFO: renamed from: h */
    public final boolean f131272h;

    /* JADX INFO: renamed from: i */
    public final Boolean f131273i;

    /* JADX INFO: renamed from: j */
    public final List f131274j;

    /* JADX INFO: renamed from: k */
    public final Set f131275k;

    /* JADX INFO: renamed from: l */
    public final Set f131276l;

    /* JADX INFO: renamed from: m */
    public final Set f131277m;

    /* JADX INFO: renamed from: n */
    public final du1 f131278n;

    /* JADX INFO: renamed from: o */
    public final Set f131279o;

    public la6(boolean z, is31 is31Var, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, Boolean bool, List list, Set set, Set set2, Set set3, du1 du1Var, Set set4) {
        this.f131265a = z;
        this.f131266b = is31Var;
        this.f131267c = z2;
        this.f131268d = z3;
        this.f131269e = str;
        this.f131270f = z4;
        this.f131271g = z5;
        this.f131272h = z6;
        this.f131273i = bool;
        this.f131274j = list;
        this.f131275k = set;
        this.f131276l = set2;
        this.f131277m = set3;
        this.f131278n = du1Var;
        this.f131279o = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la6)) {
            return false;
        }
        la6 la6Var = (la6) obj;
        return this.f131265a == la6Var.f131265a && this.f131266b == la6Var.f131266b && this.f131267c == la6Var.f131267c && this.f131268d == la6Var.f131268d && wj50.m88271j(this.f131269e, la6Var.f131269e) && this.f131270f == la6Var.f131270f && this.f131271g == la6Var.f131271g && this.f131272h == la6Var.f131272h && wj50.m88271j(this.f131273i, la6Var.f131273i) && wj50.m88271j(this.f131274j, la6Var.f131274j) && wj50.m88271j(this.f131275k, la6Var.f131275k) && wj50.m88271j(this.f131276l, la6Var.f131276l) && wj50.m88271j(this.f131277m, la6Var.f131277m) && wj50.m88271j(this.f131278n, la6Var.f131278n) && wj50.m88271j(this.f131279o, la6Var.f131279o);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f131266b.hashCode() + (Boolean.hashCode(this.f131265a) * 31)) * 31, 31, this.f131267c), 31, this.f131268d);
        String str = this.f131269e;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131270f), 31, this.f131271g), 31, this.f131272h);
        Boolean bool = this.f131273i;
        return this.f131279o.hashCode() + ((this.f131278n.hashCode() + klh.m56830b(klh.m56830b(klh.m56830b(s571.m77244c((iM77245d2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f131274j), 31, this.f131275k), 31, this.f131276l), 31, this.f131277m)) * 31);
    }
}
