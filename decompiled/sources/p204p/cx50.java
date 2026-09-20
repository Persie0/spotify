package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class cx50 {

    /* JADX INFO: renamed from: a */
    public final String f42907a;

    /* JADX INFO: renamed from: b */
    public final Set f42908b;

    /* JADX INFO: renamed from: c */
    public final String f42909c;

    /* JADX INFO: renamed from: d */
    public final List f42910d;

    /* JADX INFO: renamed from: e */
    public final xx50 f42911e;

    /* JADX INFO: renamed from: f */
    public final List f42912f;

    /* JADX INFO: renamed from: g */
    public final boolean f42913g;

    /* JADX INFO: renamed from: h */
    public final zw50 f42914h;

    /* JADX INFO: renamed from: i */
    public final zw50 f42915i;

    public cx50(String str, Set set, String str2, List list, xx50 xx50Var, List list2, boolean z, zw50 zw50Var) {
        this.f42907a = str;
        this.f42908b = set;
        this.f42909c = str2;
        this.f42910d = list;
        this.f42911e = xx50Var;
        this.f42912f = list2;
        this.f42913g = z;
        this.f42914h = zw50Var;
        this.f42915i = zw50Var;
    }

    /* JADX INFO: renamed from: a */
    public final Set m34217a() {
        return this.f42908b;
    }

    /* JADX INFO: renamed from: b */
    public final String m34218b() {
        return this.f42909c;
    }

    /* JADX INFO: renamed from: c */
    public final List m34219c() {
        return this.f42910d;
    }

    /* JADX INFO: renamed from: d */
    public final xx50 m34220d() {
        return this.f42911e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx50)) {
            return false;
        }
        cx50 cx50Var = (cx50) obj;
        return wj50.m88271j(this.f42907a, cx50Var.f42907a) && wj50.m88271j(this.f42908b, cx50Var.f42908b) && wj50.m88271j(this.f42909c, cx50Var.f42909c) && wj50.m88271j(this.f42910d, cx50Var.f42910d) && wj50.m88271j(this.f42911e, cx50Var.f42911e) && wj50.m88271j(this.f42912f, cx50Var.f42912f) && this.f42913g == cx50Var.f42913g && wj50.m88271j(this.f42914h, cx50Var.f42914h);
    }

    public final int hashCode() {
        return this.f42914h.hashCode() + s571.m77245d(s571.m77244c((this.f42911e.hashCode() + s571.m77244c(s571.m77243b(klh.m56830b(this.f42907a.hashCode() * 31, 31, this.f42908b), 31, this.f42909c), 31, this.f42910d)) * 31, 31, this.f42912f), 31, this.f42913g);
    }
}
