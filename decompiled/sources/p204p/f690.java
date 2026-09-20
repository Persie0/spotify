package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f690 {

    /* JADX INFO: renamed from: a */
    public final rg61 f66323a;

    /* JADX INFO: renamed from: b */
    public final boolean f66324b;

    /* JADX INFO: renamed from: c */
    public final boolean f66325c;

    /* JADX INFO: renamed from: d */
    public final Set f66326d;

    /* JADX INFO: renamed from: e */
    public final Set f66327e;

    /* JADX INFO: renamed from: f */
    public final int f66328f;

    /* JADX INFO: renamed from: g */
    public final ig61 f66329g;

    public f690(rg61 rg61Var, boolean z, boolean z2, Set set, Set set2, int i, ig61 ig61Var) {
        this.f66323a = rg61Var;
        this.f66324b = z;
        this.f66325c = z2;
        this.f66326d = set;
        this.f66327e = set2;
        this.f66328f = i;
        this.f66329g = ig61Var;
    }

    /* JADX INFO: renamed from: a */
    public static f690 m40838a(f690 f690Var, boolean z, boolean z2, Set set, Set set2, int i) {
        rg61 rg61Var = f690Var.f66323a;
        if ((i & 2) != 0) {
            z = f690Var.f66324b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = f690Var.f66325c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            set = f690Var.f66326d;
        }
        Set set3 = set;
        if ((i & 16) != 0) {
            set2 = f690Var.f66327e;
        }
        int i2 = f690Var.f66328f;
        ig61 ig61Var = f690Var.f66329g;
        f690Var.getClass();
        return new f690(rg61Var, z3, z4, set3, set2, i2, ig61Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f690)) {
            return false;
        }
        f690 f690Var = (f690) obj;
        return this.f66323a == f690Var.f66323a && this.f66324b == f690Var.f66324b && this.f66325c == f690Var.f66325c && wj50.m88271j(this.f66326d, f690Var.f66326d) && wj50.m88271j(this.f66327e, f690Var.f66327e) && this.f66328f == f690Var.f66328f && wj50.m88271j(this.f66329g, f690Var.f66329g);
    }

    public final int hashCode() {
        return this.f66329g.hashCode() + mt60.m62800g(this.f66328f, klh.m56830b(klh.m56830b(s571.m77245d(s571.m77245d(this.f66323a.hashCode() * 31, 31, this.f66324b), 31, this.f66325c), 31, this.f66326d), 31, this.f66327e), 31);
    }
}
