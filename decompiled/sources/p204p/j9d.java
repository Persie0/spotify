package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f110147a;

    /* JADX INFO: renamed from: b */
    public final lzu0 f110148b;

    public j9d(String str, lzu0 lzu0Var) {
        this.f110147a = str;
        this.f110148b = lzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9d)) {
            return false;
        }
        j9d j9dVar = (j9d) obj;
        return wj50.m88271j(this.f110147a, j9dVar.f110147a) && this.f110148b == j9dVar.f110148b;
    }

    public final int hashCode() {
        return this.f110148b.hashCode() + (this.f110147a.hashCode() * 31);
    }
}
