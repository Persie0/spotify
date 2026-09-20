package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class se71 {

    /* JADX INFO: renamed from: a */
    public final int f208237a;

    /* JADX INFO: renamed from: b */
    public final re71 f208238b;

    public se71(int i, re71 re71Var) {
        this.f208237a = i;
        this.f208238b = re71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se71)) {
            return false;
        }
        se71 se71Var = (se71) obj;
        return this.f208237a == se71Var.f208237a && wj50.m88271j(this.f208238b, se71Var.f208238b);
    }

    public final int hashCode() {
        return this.f208238b.hashCode() + (Integer.hashCode(this.f208237a) * 31);
    }
}
