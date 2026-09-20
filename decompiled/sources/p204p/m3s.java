package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m3s implements o3s {

    /* JADX INFO: renamed from: a */
    public final st91 f139729a;

    public m3s(st91 st91Var) {
        this.f139729a = st91Var;
    }

    /* JADX INFO: renamed from: a */
    public final st91 m60732a() {
        return this.f139729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3s) && wj50.m88271j(this.f139729a, ((m3s) obj).f139729a);
    }

    public final int hashCode() {
        st91 st91Var = this.f139729a;
        if (st91Var == null) {
            return 0;
        }
        return st91Var.f213866a.hashCode();
    }
}
