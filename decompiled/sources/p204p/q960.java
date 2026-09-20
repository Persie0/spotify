package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q960 {

    /* JADX INFO: renamed from: a */
    public final p960 f186508a;

    /* JADX INFO: renamed from: b */
    public final Set f186509b;

    /* JADX INFO: renamed from: c */
    public final Set f186510c;

    public q960(p960 p960Var, Set set, Set set2) {
        this.f186508a = p960Var;
        this.f186509b = set;
        this.f186510c = set2;
    }

    /* JADX INFO: renamed from: a */
    public static q960 m72355a(q960 q960Var, p960 p960Var, Set set, Set set2, int i) {
        if ((i & 1) != 0) {
            p960Var = q960Var.f186508a;
        }
        if ((i & 2) != 0) {
            set = q960Var.f186509b;
        }
        if ((i & 4) != 0) {
            set2 = q960Var.f186510c;
        }
        q960Var.getClass();
        return new q960(p960Var, set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q960)) {
            return false;
        }
        q960 q960Var = (q960) obj;
        return wj50.m88271j(this.f186508a, q960Var.f186508a) && wj50.m88271j(this.f186509b, q960Var.f186509b) && wj50.m88271j(this.f186510c, q960Var.f186510c);
    }

    public final int hashCode() {
        return this.f186510c.hashCode() + klh.m56830b(this.f186508a.hashCode() * 31, 31, this.f186509b);
    }
}
