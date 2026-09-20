package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y791 {

    /* JADX INFO: renamed from: c */
    public static final y791 f269997c;

    /* JADX INFO: renamed from: a */
    public final z891 f269998a;

    /* JADX INFO: renamed from: b */
    public final z891 f269999b;

    static {
        u891 u891Var = u891.f227877a;
        f269997c = new y791(u891Var, u891Var);
    }

    public y791(z891 z891Var, z891 z891Var2) {
        this.f269998a = z891Var;
        this.f269999b = z891Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y791)) {
            return false;
        }
        y791 y791Var = (y791) obj;
        return wj50.m88271j(this.f269998a, y791Var.f269998a) && wj50.m88271j(this.f269999b, y791Var.f269999b);
    }

    public final int hashCode() {
        return this.f269999b.hashCode() + (this.f269998a.hashCode() * 31);
    }
}
