package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vs3 {

    /* JADX INFO: renamed from: a */
    public final String f244329a;

    /* JADX INFO: renamed from: b */
    public final un20 f244330b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f244331c;

    /* JADX INFO: renamed from: d */
    public final boolean f244332d;

    public vs3(String str, ArrayList arrayList, un20 un20Var, boolean z) {
        this.f244329a = str;
        this.f244330b = un20Var;
        this.f244331c = arrayList;
        this.f244332d = z;
    }

    /* JADX INFO: renamed from: a */
    public final List m86304a() {
        return this.f244331c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs3)) {
            return false;
        }
        vs3 vs3Var = (vs3) obj;
        return wj50.m88271j(this.f244329a, vs3Var.f244329a) && wj50.m88271j(this.f244330b, vs3Var.f244330b) && this.f244331c.equals(vs3Var.f244331c) && this.f244332d == vs3Var.f244332d;
    }

    public final int hashCode() {
        int iHashCode = this.f244329a.hashCode() * 31;
        un20 un20Var = this.f244330b;
        return Boolean.hashCode(this.f244332d) + lq51.m59700f(this.f244331c, (iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31);
    }
}
