package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r53 {

    /* JADX INFO: renamed from: a */
    public final String f195934a;

    /* JADX INFO: renamed from: b */
    public final String f195935b;

    /* JADX INFO: renamed from: c */
    public final String f195936c;

    /* JADX INFO: renamed from: d */
    public final String f195937d;

    /* JADX INFO: renamed from: e */
    public final String f195938e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f195939f;

    /* JADX INFO: renamed from: g */
    public final String f195940g;

    /* JADX INFO: renamed from: h */
    public final is9 f195941h;

    /* JADX INFO: renamed from: i */
    public final rcm0 f195942i;

    /* JADX INFO: renamed from: j */
    public final boolean f195943j;

    /* JADX INFO: renamed from: k */
    public final int f195944k;

    /* JADX INFO: renamed from: l */
    public final List f195945l;

    /* JADX INFO: renamed from: m */
    public final String f195946m;

    public r53(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, is9 is9Var, rcm0 rcm0Var, boolean z, int i, List list, String str7) {
        this.f195934a = str;
        this.f195935b = str2;
        this.f195936c = str3;
        this.f195937d = str4;
        this.f195938e = str5;
        this.f195939f = arrayList;
        this.f195940g = str6;
        this.f195941h = is9Var;
        this.f195942i = rcm0Var;
        this.f195943j = z;
        this.f195944k = i;
        this.f195945l = list;
        this.f195946m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r53)) {
            return false;
        }
        r53 r53Var = (r53) obj;
        return wj50.m88271j(this.f195934a, r53Var.f195934a) && wj50.m88271j(this.f195935b, r53Var.f195935b) && wj50.m88271j(this.f195936c, r53Var.f195936c) && wj50.m88271j(this.f195937d, r53Var.f195937d) && wj50.m88271j(this.f195938e, r53Var.f195938e) && this.f195939f.equals(r53Var.f195939f) && wj50.m88271j(this.f195940g, r53Var.f195940g) && this.f195941h.equals(r53Var.f195941h) && this.f195942i.equals(r53Var.f195942i) && this.f195943j == r53Var.f195943j && this.f195944k == r53Var.f195944k && this.f195945l.equals(r53Var.f195945l) && wj50.m88271j(this.f195946m, r53Var.f195946m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f195934a.hashCode() * 31, 31, this.f195935b), 31, this.f195936c), 31, this.f195937d);
        String str = this.f195938e;
        return this.f195946m.hashCode() + s571.m77244c(f710.m40938f(this.f195944k, s571.m77245d(yds.m93483m(this.f195942i, (this.f195941h.hashCode() + s571.m77243b(lq51.m59700f(this.f195939f, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f195940g)) * 31, 31), 31, this.f195943j), 31), 31, this.f195945l);
    }
}
