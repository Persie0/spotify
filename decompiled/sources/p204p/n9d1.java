package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n9d1 {

    /* JADX INFO: renamed from: a */
    public final String f151774a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f151775b;

    /* JADX INFO: renamed from: c */
    public final un20 f151776c;

    /* JADX INFO: renamed from: d */
    public final boolean f151777d;

    /* JADX INFO: renamed from: e */
    public final String f151778e;

    /* JADX INFO: renamed from: f */
    public final String f151779f;

    /* JADX INFO: renamed from: g */
    public final String f151780g;

    public n9d1(String str, ArrayList arrayList, un20 un20Var, boolean z, String str2, String str3, String str4) {
        this.f151774a = str;
        this.f151775b = arrayList;
        this.f151776c = un20Var;
        this.f151777d = z;
        this.f151778e = str2;
        this.f151779f = str3;
        this.f151780g = str4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63916a() {
        return this.f151777d;
    }

    /* JADX INFO: renamed from: b */
    public final String m63917b() {
        return this.f151780g;
    }

    /* JADX INFO: renamed from: c */
    public final un20 m63918c() {
        return this.f151776c;
    }

    /* JADX INFO: renamed from: d */
    public final String m63919d() {
        return this.f151774a;
    }

    /* JADX INFO: renamed from: e */
    public final List m63920e() {
        return this.f151775b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9d1)) {
            return false;
        }
        n9d1 n9d1Var = (n9d1) obj;
        return wj50.m88271j(this.f151774a, n9d1Var.f151774a) && wj50.m88271j(this.f151775b, n9d1Var.f151775b) && wj50.m88271j(this.f151776c, n9d1Var.f151776c) && this.f151777d == n9d1Var.f151777d && wj50.m88271j(this.f151778e, n9d1Var.f151778e) && wj50.m88271j(this.f151779f, n9d1Var.f151779f) && wj50.m88271j(this.f151780g, n9d1Var.f151780g);
    }

    /* JADX INFO: renamed from: f */
    public final String m63921f() {
        return this.f151779f;
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f151775b, this.f151774a.hashCode() * 31, 31);
        un20 un20Var = this.f151776c;
        return this.f151780g.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d((iM59700f + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f151777d), 31, this.f151778e), 31, this.f151779f);
    }

    public /* synthetic */ n9d1(String str, ArrayList arrayList, un20 un20Var, String str2, String str3) {
        this(str, arrayList, un20Var, false, str2, str3, "");
    }
}
