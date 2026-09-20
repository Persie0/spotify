package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qd71 {

    /* JADX INFO: renamed from: a */
    public final pd71 f187503a;

    /* JADX INFO: renamed from: b */
    public final aoz0 f187504b;

    public qd71(pd71 pd71Var, aoz0 aoz0Var) {
        this.f187503a = pd71Var;
        this.f187504b = aoz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd71)) {
            return false;
        }
        qd71 qd71Var = (qd71) obj;
        return wj50.m88271j(this.f187503a, qd71Var.f187503a) && this.f187504b == qd71Var.f187504b;
    }

    public final int hashCode() {
        return this.f187504b.hashCode() + (this.f187503a.hashCode() * 31);
    }
}
