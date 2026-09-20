package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fzc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f74965a;

    /* JADX INFO: renamed from: b */
    public final String f74966b;

    public fzc0(String str, String str2) {
        this.f74965a = str;
        this.f74966b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzc0)) {
            return false;
        }
        fzc0 fzc0Var = (fzc0) obj;
        return wj50.m88271j(this.f74965a, fzc0Var.f74965a) && wj50.m88271j(this.f74966b, fzc0Var.f74966b);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f74965a;
    }

    public final int hashCode() {
        int iHashCode = this.f74965a.hashCode() * 961;
        String str = this.f74966b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
