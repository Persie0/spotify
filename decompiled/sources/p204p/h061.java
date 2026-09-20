package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h061 {

    /* JADX INFO: renamed from: a */
    public final d061 f86160a;

    /* JADX INFO: renamed from: b */
    public final g261 f86161b;

    /* JADX INFO: renamed from: c */
    public final int f86162c;

    public h061(d061 d061Var, g261 g261Var, int i) {
        this.f86160a = d061Var;
        this.f86161b = g261Var;
        this.f86162c = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m46255a() {
        return this.f86162c;
    }

    /* JADX INFO: renamed from: b */
    public final d061 m46256b() {
        return this.f86160a;
    }

    /* JADX INFO: renamed from: c */
    public final g261 m46257c() {
        return this.f86161b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h061)) {
            return false;
        }
        h061 h061Var = (h061) obj;
        return wj50.m88271j(this.f86160a, h061Var.f86160a) && this.f86161b.equals(h061Var.f86161b) && this.f86162c == h061Var.f86162c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f86162c) + ((this.f86161b.hashCode() + (this.f86160a.hashCode() * 31)) * 31);
    }
}
