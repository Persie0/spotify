package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d171 {

    /* JADX INFO: renamed from: a */
    public final boolean f44177a;

    /* JADX INFO: renamed from: b */
    public final long f44178b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f44179c;

    /* JADX INFO: renamed from: d */
    public final int f44180d;

    /* JADX INFO: renamed from: e */
    public final Object f44181e;

    /* JADX INFO: renamed from: f */
    public final gh00 f44182f;

    public d171(boolean z, long j, ArrayList arrayList, int i, List list, gh00 gh00Var) {
        this.f44177a = z;
        this.f44178b = j;
        this.f44179c = arrayList;
        this.f44180d = i;
        this.f44181e = list;
        this.f44182f = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d171)) {
            return false;
        }
        d171 d171Var = (d171) obj;
        return this.f44177a == d171Var.f44177a && this.f44178b == d171Var.f44178b && this.f44179c.equals(d171Var.f44179c) && this.f44180d == d171Var.f44180d && this.f44181e.equals(d171Var.f44181e) && wj50.m88271j(this.f44182f, d171Var.f44182f);
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(mt60.m62800g(this.f44180d, lq51.m59700f(this.f44179c, dq60.m36605e(Boolean.hashCode(this.f44177a) * 31, this.f44178b, 31), 31), 31), 31, this.f44181e);
        gh00 gh00Var = this.f44182f;
        return iM36604d + (gh00Var == null ? 0 : gh00Var.hashCode());
    }
}
