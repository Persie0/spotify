package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i0e0 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f97215a;

    /* JADX INFO: renamed from: b */
    public final rq91 f97216b;

    /* JADX INFO: renamed from: c */
    public final ezs0 f97217c;

    public i0e0(String str, rq91 rq91Var, ezs0 ezs0Var) {
        this.f97215a = str;
        this.f97216b = rq91Var;
        this.f97217c = ezs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0e0)) {
            return false;
        }
        i0e0 i0e0Var = (i0e0) obj;
        return wj50.m88271j(this.f97215a, i0e0Var.f97215a) && this.f97216b.equals(i0e0Var.f97216b) && this.f97217c.equals(i0e0Var.f97217c);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f97215a;
    }

    public final int hashCode() {
        return this.f97217c.hashCode() + mt60.m62800g(this.f97216b.f201781b, this.f97215a.hashCode() * 31, 31);
    }
}
