package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pgv extends qgv {

    /* JADX INFO: renamed from: a */
    public final String f177414a;

    /* JADX INFO: renamed from: b */
    public final iad1 f177415b;

    public pgv(String str, iad1 iad1Var) {
        this.f177414a = str;
        this.f177415b = iad1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgv)) {
            return false;
        }
        pgv pgvVar = (pgv) obj;
        return wj50.m88271j(this.f177414a, pgvVar.f177414a) && wj50.m88271j(this.f177415b, pgvVar.f177415b);
    }

    public final int hashCode() {
        return this.f177415b.hashCode() + (this.f177414a.hashCode() * 31);
    }
}
