package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ic8 {

    /* JADX INFO: renamed from: a */
    public final boolean f100753a;

    /* JADX INFO: renamed from: b */
    public final boolean f100754b;

    /* JADX INFO: renamed from: c */
    public final boolean f100755c;

    /* JADX INFO: renamed from: d */
    public final Set f100756d;

    public ic8(Set set, boolean z, boolean z2, boolean z3) {
        this.f100753a = z;
        this.f100754b = z2;
        this.f100755c = z3;
        this.f100756d = set;
    }

    /* JADX INFO: renamed from: a */
    public static ic8 m50242a(ic8 ic8Var, boolean z, boolean z2, boolean z3, Set set, int i) {
        if ((i & 1) != 0) {
            z = ic8Var.f100753a;
        }
        if ((i & 2) != 0) {
            z2 = ic8Var.f100754b;
        }
        if ((i & 4) != 0) {
            z3 = ic8Var.f100755c;
        }
        if ((i & 8) != 0) {
            set = ic8Var.f100756d;
        }
        ic8Var.getClass();
        return new ic8(set, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic8)) {
            return false;
        }
        ic8 ic8Var = (ic8) obj;
        return this.f100753a == ic8Var.f100753a && this.f100754b == ic8Var.f100754b && this.f100755c == ic8Var.f100755c && wj50.m88271j(this.f100756d, ic8Var.f100756d);
    }

    public final int hashCode() {
        return this.f100756d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f100753a) * 31, 31, this.f100754b), 31, this.f100755c);
    }
}
