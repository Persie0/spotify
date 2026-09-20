package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class au91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f19895a;

    /* JADX INFO: renamed from: b */
    public final st91 f19896b;

    public au91(zt91 zt91Var, st91 st91Var) {
        this.f19895a = zt91Var;
        this.f19896b = st91Var;
    }

    /* JADX INFO: renamed from: a */
    public final zt91 m27169a() {
        return this.f19895a;
    }

    /* JADX INFO: renamed from: b */
    public final st91 m27170b() {
        return this.f19896b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au91)) {
            return false;
        }
        au91 au91Var = (au91) obj;
        return wj50.m88271j(this.f19895a, au91Var.f19895a) && wj50.m88271j(this.f19896b, au91Var.f19896b);
    }

    public final int hashCode() {
        return this.f19896b.f213866a.hashCode() + (this.f19895a.hashCode() * 31);
    }

    public final String toString() {
        return "UbiEventPath(location=" + this.f19895a + ", parentAbsoluteLocation=" + this.f19896b + ')';
    }
}
