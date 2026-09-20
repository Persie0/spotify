package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lpb1 {

    /* JADX INFO: renamed from: a */
    public final ved1 f135726a;

    /* JADX INFO: renamed from: b */
    public final ved1 f135727b;

    public lpb1(ved1 ved1Var, ved1 ved1Var2) {
        this.f135726a = ved1Var;
        this.f135727b = ved1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpb1)) {
            return false;
        }
        lpb1 lpb1Var = (lpb1) obj;
        return wj50.m88271j(this.f135726a, lpb1Var.f135726a) && wj50.m88271j(this.f135727b, lpb1Var.f135727b);
    }

    public final int hashCode() {
        return this.f135727b.hashCode() + (this.f135726a.hashCode() * 31);
    }
}
