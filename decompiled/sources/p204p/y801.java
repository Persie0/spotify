package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y801 {

    /* JADX INFO: renamed from: a */
    public final boolean f270163a;

    /* JADX INFO: renamed from: b */
    public final String f270164b;

    /* JADX INFO: renamed from: c */
    public final boolean f270165c;

    public y801(String str, boolean z, boolean z2) {
        this.f270163a = z;
        this.f270164b = str;
        this.f270165c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static y801 m93035a(y801 y801Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = y801Var.f270163a;
        }
        if ((i & 2) != 0) {
            str = y801Var.f270164b;
        }
        boolean z2 = (i & 4) != 0 ? y801Var.f270165c : false;
        y801Var.getClass();
        return new y801(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y801)) {
            return false;
        }
        y801 y801Var = (y801) obj;
        return this.f270163a == y801Var.f270163a && wj50.m88271j(this.f270164b, y801Var.f270164b) && this.f270165c == y801Var.f270165c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270165c) + s571.m77243b(Boolean.hashCode(this.f270163a) * 31, 31, this.f270164b);
    }
}
