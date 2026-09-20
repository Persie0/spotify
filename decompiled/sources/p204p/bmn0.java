package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bmn0 {

    /* JADX INFO: renamed from: a */
    public final String f28585a;

    /* JADX INFO: renamed from: b */
    public final int f28586b;

    /* JADX INFO: renamed from: c */
    public final String f28587c;

    public bmn0(String str, int i, String str2) {
        this.f28585a = str;
        this.f28586b = i;
        this.f28587c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmn0)) {
            return false;
        }
        bmn0 bmn0Var = (bmn0) obj;
        return wj50.m88271j(this.f28585a, bmn0Var.f28585a) && this.f28586b == bmn0Var.f28586b && wj50.m88271j(this.f28587c, bmn0Var.f28587c);
    }

    public final int hashCode() {
        return this.f28587c.hashCode() + f710.m40938f(this.f28586b, this.f28585a.hashCode() * 31, 31);
    }
}
