package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h3t {

    /* JADX INFO: renamed from: a */
    public final Set f87311a;

    /* JADX INFO: renamed from: b */
    public final boolean f87312b;

    /* JADX INFO: renamed from: c */
    public final boolean f87313c;

    /* JADX INFO: renamed from: d */
    public final boolean f87314d;

    public h3t(Set set, boolean z, boolean z2, boolean z3) {
        this.f87311a = set;
        this.f87312b = z;
        this.f87313c = z2;
        this.f87314d = z3;
    }

    /* JADX INFO: renamed from: a */
    public static h3t m46602a(h3t h3tVar, Set set, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            set = h3tVar.f87311a;
        }
        if ((i & 2) != 0) {
            z = h3tVar.f87312b;
        }
        if ((i & 4) != 0) {
            z2 = h3tVar.f87313c;
        }
        if ((i & 8) != 0) {
            z3 = h3tVar.f87314d;
        }
        h3tVar.getClass();
        return new h3t(set, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3t)) {
            return false;
        }
        h3t h3tVar = (h3t) obj;
        return wj50.m88271j(this.f87311a, h3tVar.f87311a) && this.f87312b == h3tVar.f87312b && this.f87313c == h3tVar.f87313c && this.f87314d == h3tVar.f87314d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87314d) + s571.m77245d(s571.m77245d(this.f87311a.hashCode() * 31, 31, this.f87312b), 31, this.f87313c);
    }
}
