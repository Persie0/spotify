package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class f6b {

    /* JADX INFO: renamed from: f */
    public static final f6b f66348f;

    /* JADX INFO: renamed from: a */
    public final Object f66349a;

    /* JADX INFO: renamed from: b */
    public final Object f66350b;

    /* JADX INFO: renamed from: c */
    public final int f66351c;

    /* JADX INFO: renamed from: d */
    public final int f66352d;

    /* JADX INFO: renamed from: e */
    public final boolean f66353e;

    static {
        lau lauVar = lau.f131415a;
        f66348f = new f6b(lauVar, lauVar, 0, 0, false);
    }

    public f6b(List list, List list2, int i, int i2, boolean z) {
        this.f66349a = list;
        this.f66350b = list2;
        this.f66351c = i;
        this.f66352d = i2;
        this.f66353e = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final List m40847a() {
        return this.f66350b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final List m40848b() {
        return this.f66349a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6b)) {
            return false;
        }
        f6b f6bVar = (f6b) obj;
        return this.f66349a.equals(f6bVar.f66349a) && this.f66350b.equals(f6bVar.f66350b) && this.f66351c == f6bVar.f66351c && this.f66352d == f6bVar.f66352d && this.f66353e == f6bVar.f66353e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66353e) + mt60.m62800g(this.f66352d, mt60.m62800g(this.f66351c, dq60.m36604d(this.f66349a.hashCode() * 31, 31, this.f66350b), 31), 31);
    }
}
