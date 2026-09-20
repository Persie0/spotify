package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k911 {

    /* JADX INFO: renamed from: a */
    public final String f120503a;

    /* JADX INFO: renamed from: b */
    public final d850 f120504b;

    public k911(String str, d850 d850Var) {
        this.f120503a = str;
        this.f120504b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k911)) {
            return false;
        }
        k911 k911Var = (k911) obj;
        return wj50.m88271j(this.f120503a, k911Var.f120503a) && wj50.m88271j(this.f120504b, k911Var.f120504b);
    }

    public final int hashCode() {
        int iHashCode = this.f120503a.hashCode() * 31;
        d850 d850Var = this.f120504b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
