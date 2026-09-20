package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fkj0 {

    /* JADX INFO: renamed from: a */
    public final String f70553a;

    /* JADX INFO: renamed from: b */
    public final eh00 f70554b;

    public fkj0(String str, eh00 eh00Var) {
        this.f70553a = str;
        this.f70554b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkj0)) {
            return false;
        }
        fkj0 fkj0Var = (fkj0) obj;
        return wj50.m88271j(this.f70553a, fkj0Var.f70553a) && wj50.m88271j(this.f70554b, fkj0Var.f70554b);
    }

    public final int hashCode() {
        return this.f70554b.hashCode() + (this.f70553a.hashCode() * 31);
    }
}
