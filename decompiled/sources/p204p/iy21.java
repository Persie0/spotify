package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class iy21 {

    /* JADX INFO: renamed from: a */
    public final String f106826a;

    /* JADX INFO: renamed from: b */
    public final hys0 f106827b;

    /* JADX INFO: renamed from: c */
    public final Set f106828c;

    /* JADX INFO: renamed from: d */
    public final n031 f106829d;

    public iy21(String str, hys0 hys0Var, Set set, n031 n031Var) {
        this.f106826a = str;
        this.f106827b = hys0Var;
        this.f106828c = set;
        this.f106829d = n031Var;
    }

    /* JADX INFO: renamed from: a */
    public static iy21 m51877a(iy21 iy21Var, Set set, n031 n031Var, int i) {
        String str = iy21Var.f106826a;
        hys0 hys0Var = iy21Var.f106827b;
        if ((i & 4) != 0) {
            set = iy21Var.f106828c;
        }
        if ((i & 8) != 0) {
            n031Var = iy21Var.f106829d;
        }
        iy21Var.getClass();
        return new iy21(str, hys0Var, set, n031Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy21)) {
            return false;
        }
        iy21 iy21Var = (iy21) obj;
        return wj50.m88271j(this.f106826a, iy21Var.f106826a) && wj50.m88271j(this.f106827b, iy21Var.f106827b) && wj50.m88271j(this.f106828c, iy21Var.f106828c) && wj50.m88271j(this.f106829d, iy21Var.f106829d);
    }

    public final int hashCode() {
        int iHashCode = this.f106826a.hashCode() * 31;
        this.f106827b.getClass();
        int iM56830b = klh.m56830b((Boolean.hashCode(false) + iHashCode) * 31, 31, this.f106828c);
        n031 n031Var = this.f106829d;
        return iM56830b + (n031Var != null ? n031Var.hashCode() : 0);
    }

    public iy21(String str, hys0 hys0Var) {
        this(str, hys0Var, gbu.f78413a, null);
    }
}
