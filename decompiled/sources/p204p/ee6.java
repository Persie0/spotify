package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ee6 {

    /* JADX INFO: renamed from: a */
    public final String f58684a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1961i f58685b;

    /* JADX INFO: renamed from: c */
    public final d850 f58686c;

    public ee6(String str, AbstractC1961i abstractC1961i, d850 d850Var) {
        this.f58684a = str;
        this.f58685b = abstractC1961i;
        this.f58686c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee6)) {
            return false;
        }
        ee6 ee6Var = (ee6) obj;
        return wj50.m88271j(this.f58684a, ee6Var.f58684a) && wj50.m88271j(this.f58685b, ee6Var.f58685b) && wj50.m88271j(this.f58686c, ee6Var.f58686c);
    }

    public final int hashCode() {
        return this.f58686c.hashCode() + ((this.f58685b.hashCode() + (this.f58684a.hashCode() * 31)) * 31);
    }
}
