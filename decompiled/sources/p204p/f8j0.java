package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f8j0 implements fn41 {

    /* JADX INFO: renamed from: a */
    public final a8j0 f67002a;

    /* JADX INFO: renamed from: b */
    public final e8j0 f67003b;

    public f8j0(a8j0 a8j0Var, e8j0 e8j0Var) {
        this.f67002a = a8j0Var;
        this.f67003b = e8j0Var;
    }

    @Override // p204p.fn41
    /* JADX INFO: renamed from: a */
    public final en41 mo41039a() {
        return this.f67002a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8j0)) {
            return false;
        }
        f8j0 f8j0Var = (f8j0) obj;
        return wj50.m88271j(this.f67002a, f8j0Var.f67002a) && wj50.m88271j(this.f67003b, f8j0Var.f67003b);
    }

    public final int hashCode() {
        return this.f67003b.hashCode() + (this.f67002a.hashCode() * 31);
    }
}
