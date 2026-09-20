package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wwp0 {

    /* JADX INFO: renamed from: c */
    public static final wwp0 f255807c;

    /* JADX INFO: renamed from: a */
    public final Object f255808a;

    /* JADX INFO: renamed from: b */
    public final Object f255809b;

    static {
        gbu gbuVar = gbu.f78413a;
        f255807c = new wwp0(gbuVar, gbuVar);
    }

    public wwp0(Set set, Set set2) {
        this.f255808a = set;
        this.f255809b = set2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public final wwp0 m89211a(xwp0 xwp0Var) {
        String str = xwp0Var.f266733c;
        boolean z = xwp0Var.f266731a;
        ?? r2 = this.f255809b;
        ?? r3 = this.f255808a;
        if (z) {
            return xwp0Var.f266732b ? new wwp0(s601.m77308k0(str, r3), s601.m77304g0(str, r2)) : new wwp0(s601.m77304g0(str, r3), s601.m77308k0(str, r2));
        }
        return new wwp0(s601.m77304g0(str, r3), s601.m77304g0(str, r2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwp0)) {
            return false;
        }
        wwp0 wwp0Var = (wwp0) obj;
        return this.f255808a.equals(wwp0Var.f255808a) && this.f255809b.equals(wwp0Var.f255809b);
    }

    public final int hashCode() {
        return this.f255809b.hashCode() + (this.f255808a.hashCode() * 31);
    }
}
