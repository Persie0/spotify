package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cwi {

    /* JADX INFO: renamed from: a */
    public final boolean f42760a;

    /* JADX INFO: renamed from: b */
    public final boolean f42761b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f42762c;

    /* JADX INFO: renamed from: d */
    public final boolean f42763d;

    /* JADX INFO: renamed from: e */
    public final boolean f42764e;

    public cwi(boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4) {
        this.f42760a = z;
        this.f42761b = z2;
        this.f42762c = arrayList;
        this.f42763d = z3;
        this.f42764e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwi)) {
            return false;
        }
        cwi cwiVar = (cwi) obj;
        return this.f42760a == cwiVar.f42760a && this.f42761b == cwiVar.f42761b && this.f42762c.equals(cwiVar.f42762c) && this.f42763d == cwiVar.f42763d && this.f42764e == cwiVar.f42764e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42764e) + s571.m77245d(lq51.m59700f(this.f42762c, s571.m77245d(Boolean.hashCode(this.f42760a) * 31, 31, this.f42761b), 31), 31, this.f42763d);
    }
}
