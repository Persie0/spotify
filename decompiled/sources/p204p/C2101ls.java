package p204p;

/* JADX INFO: renamed from: p.ls */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101ls implements InterfaceC2188ns {

    /* JADX INFO: renamed from: a */
    public final qf40 f136401a;

    /* JADX INFO: renamed from: b */
    public final boolean f136402b;

    public C2101ls(qf40 qf40Var, boolean z) {
        this.f136401a = qf40Var;
        this.f136402b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2101ls)) {
            return false;
        }
        C2101ls c2101ls = (C2101ls) obj;
        return wj50.m88271j(this.f136401a, c2101ls.f136401a) && this.f136402b == c2101ls.f136402b;
    }

    public final int hashCode() {
        qf40 qf40Var = this.f136401a;
        return Boolean.hashCode(this.f136402b) + ((qf40Var == null ? 0 : qf40Var.hashCode()) * 31);
    }
}
