package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mo20 {

    /* JADX INFO: renamed from: a */
    public final ro20 f145556a;

    /* JADX INFO: renamed from: b */
    public final rq91 f145557b;

    public mo20(ro20 ro20Var, rq91 rq91Var) {
        this.f145556a = ro20Var;
        this.f145557b = rq91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo20)) {
            return false;
        }
        mo20 mo20Var = (mo20) obj;
        return this.f145556a.equals(mo20Var.f145556a) && this.f145557b.equals(mo20Var.f145557b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145557b.f201781b) + ((this.f145556a.hashCode() + 15262386) * 31);
    }
}
