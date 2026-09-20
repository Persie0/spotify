package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qae0 {

    /* JADX INFO: renamed from: a */
    public final String f186857a;

    /* JADX INFO: renamed from: b */
    public final String f186858b;

    public qae0(String str, String str2) {
        this.f186857a = str;
        this.f186858b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qae0)) {
            return false;
        }
        qae0 qae0Var = (qae0) obj;
        return wj50.m88271j(this.f186857a, qae0Var.f186857a) && wj50.m88271j(this.f186858b, qae0Var.f186858b);
    }

    public final int hashCode() {
        return this.f186858b.hashCode() + (this.f186857a.hashCode() * 31);
    }
}
