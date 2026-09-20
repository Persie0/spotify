package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ngz0 {

    /* JADX INFO: renamed from: a */
    public final String f153813a;

    /* JADX INFO: renamed from: b */
    public final t2b0 f153814b;

    /* JADX INFO: renamed from: c */
    public final boolean f153815c;

    public ngz0(String str, t2b0 t2b0Var, boolean z) {
        this.f153813a = str;
        this.f153814b = t2b0Var;
        this.f153815c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngz0)) {
            return false;
        }
        ngz0 ngz0Var = (ngz0) obj;
        return wj50.m88271j(this.f153813a, ngz0Var.f153813a) && wj50.m88271j(this.f153814b, ngz0Var.f153814b) && this.f153815c == ngz0Var.f153815c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153815c) + ((this.f153814b.hashCode() + (this.f153813a.hashCode() * 31)) * 31);
    }
}
