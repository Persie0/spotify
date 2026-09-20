package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w991 {

    /* JADX INFO: renamed from: a */
    public final b791 f249126a;

    /* JADX INFO: renamed from: b */
    public final String f249127b;

    public w991(b791 b791Var, String str) {
        this.f249126a = b791Var;
        this.f249127b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w991)) {
            return false;
        }
        w991 w991Var = (w991) obj;
        return wj50.m88271j(this.f249126a, w991Var.f249126a) && wj50.m88271j(this.f249127b, w991Var.f249127b);
    }

    public final int hashCode() {
        b791 b791Var = this.f249126a;
        return this.f249127b.hashCode() + ((b791Var == null ? 0 : b791Var.hashCode()) * 31);
    }
}
