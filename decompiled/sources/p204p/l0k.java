package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class l0k {

    /* JADX INFO: renamed from: a */
    public final String f128464a;

    /* JADX INFO: renamed from: b */
    public final String f128465b;

    /* JADX INFO: renamed from: c */
    public final e340 f128466c;

    public l0k(String str, String str2, e340 e340Var) {
        this.f128464a = str;
        this.f128465b = str2;
        this.f128466c = e340Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0k)) {
            return false;
        }
        l0k l0kVar = (l0k) obj;
        return wj50.m88271j(this.f128464a, l0kVar.f128464a) && wj50.m88271j(this.f128465b, l0kVar.f128465b) && wj50.m88271j(this.f128466c, l0kVar.f128466c);
    }

    public final int hashCode() {
        return this.f128466c.hashCode() + s571.m77243b(this.f128464a.hashCode() * 31, 31, this.f128465b);
    }
}
