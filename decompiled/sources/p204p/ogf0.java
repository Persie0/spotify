package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ogf0 {

    /* JADX INFO: renamed from: a */
    public final int f165113a;

    /* JADX INFO: renamed from: b */
    public final boolean f165114b;

    /* JADX INFO: renamed from: c */
    public final List f165115c;

    /* JADX INFO: renamed from: d */
    public final boolean f165116d;

    /* JADX INFO: renamed from: e */
    public final boolean f165117e;

    public ogf0(int i, boolean z, List list, boolean z2, boolean z3) {
        this.f165113a = i;
        this.f165114b = z;
        this.f165115c = list;
        this.f165116d = z2;
        this.f165117e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogf0)) {
            return false;
        }
        ogf0 ogf0Var = (ogf0) obj;
        return this.f165113a == ogf0Var.f165113a && this.f165114b == ogf0Var.f165114b && wj50.m88271j(this.f165115c, ogf0Var.f165115c) && this.f165116d == ogf0Var.f165116d && this.f165117e == ogf0Var.f165117e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165117e) + s571.m77245d(s571.m77244c(s571.m77245d(Integer.hashCode(this.f165113a) * 31, 31, this.f165114b), 31, this.f165115c), 31, this.f165116d);
    }
}
