package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gb40 {

    /* JADX INFO: renamed from: a */
    public final blt0 f78185a;

    /* JADX INFO: renamed from: b */
    public final boolean f78186b;

    /* JADX INFO: renamed from: c */
    public final eb40 f78187c;

    /* JADX INFO: renamed from: d */
    public final ig40 f78188d;

    public gb40(blt0 blt0Var, boolean z, eb40 eb40Var, ig40 ig40Var) {
        this.f78185a = blt0Var;
        this.f78186b = z;
        this.f78187c = eb40Var;
        this.f78188d = ig40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb40)) {
            return false;
        }
        gb40 gb40Var = (gb40) obj;
        return wj50.m88271j(this.f78185a, gb40Var.f78185a) && this.f78186b == gb40Var.f78186b && wj50.m88271j(this.f78187c, gb40Var.f78187c) && wj50.m88271j(this.f78188d, gb40Var.f78188d);
    }

    public final int hashCode() {
        return this.f78188d.hashCode() + ((this.f78187c.hashCode() + s571.m77245d(this.f78185a.hashCode() * 31, 31, this.f78186b)) * 31);
    }
}
