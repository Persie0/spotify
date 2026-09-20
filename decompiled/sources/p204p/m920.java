package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m920 {

    /* JADX INFO: renamed from: a */
    public final l920 f141197a;

    /* JADX INFO: renamed from: b */
    public final boolean f141198b;

    public m920(l920 l920Var, boolean z) {
        this.f141197a = l920Var;
        this.f141198b = z;
    }

    /* JADX INFO: renamed from: a */
    public static m920 m61138a(m920 m920Var, l920 l920Var, boolean z, int i) {
        if ((i & 1) != 0) {
            l920Var = m920Var.f141197a;
        }
        if ((i & 2) != 0) {
            z = m920Var.f141198b;
        }
        m920Var.getClass();
        return new m920(l920Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m920)) {
            return false;
        }
        m920 m920Var = (m920) obj;
        return wj50.m88271j(this.f141197a, m920Var.f141197a) && this.f141198b == m920Var.f141198b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141198b) + (this.f141197a.hashCode() * 31);
    }
}
