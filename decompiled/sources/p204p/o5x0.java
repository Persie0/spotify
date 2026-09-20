package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o5x0 extends y6x0 {

    /* JADX INFO: renamed from: a */
    public final String f162147a;

    /* JADX INFO: renamed from: b */
    public final String f162148b;

    /* JADX INFO: renamed from: c */
    public final String f162149c;

    /* JADX INFO: renamed from: d */
    public final String f162150d;

    /* JADX INFO: renamed from: e */
    public final ihi f162151e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f162152f;

    /* JADX INFO: renamed from: g */
    public final String f162153g;

    /* JADX INFO: renamed from: h */
    public final Map f162154h;

    /* JADX INFO: renamed from: i */
    public final la80 f162155i;

    /* JADX INFO: renamed from: j */
    public final Map f162156j;

    public o5x0(String str, String str2, String str3, String str4, ihi ihiVar, ArrayList arrayList, String str5, Map map, la80 la80Var, Map map2) {
        this.f162147a = str;
        this.f162148b = str2;
        this.f162149c = str3;
        this.f162150d = str4;
        this.f162151e = ihiVar;
        this.f162152f = arrayList;
        this.f162153g = str5;
        this.f162154h = map;
        this.f162155i = la80Var;
        this.f162156j = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5x0)) {
            return false;
        }
        o5x0 o5x0Var = (o5x0) obj;
        return wj50.m88271j(this.f162147a, o5x0Var.f162147a) && wj50.m88271j(this.f162148b, o5x0Var.f162148b) && this.f162149c.equals(o5x0Var.f162149c) && wj50.m88271j(this.f162150d, o5x0Var.f162150d) && this.f162151e.equals(o5x0Var.f162151e) && this.f162152f.equals(o5x0Var.f162152f) && this.f162153g.equals(o5x0Var.f162153g) && wj50.m88271j(this.f162154h, o5x0Var.f162154h) && this.f162155i == o5x0Var.f162155i && wj50.m88271j(this.f162156j, o5x0Var.f162156j);
    }

    public final int hashCode() {
        return this.f162156j.hashCode() + ((this.f162155i.hashCode() + edb.m38557f(s571.m77243b(lq51.m59700f(this.f162152f, (this.f162151e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f162147a.hashCode() * 31, 31, this.f162148b), 31, this.f162149c), 31, this.f162150d)) * 31, 31), 31, this.f162153g), 31, this.f162154h)) * 31);
    }
}
