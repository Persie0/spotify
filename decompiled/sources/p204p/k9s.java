package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k9s {

    /* JADX INFO: renamed from: a */
    public final hz80 f120682a;

    /* JADX INFO: renamed from: b */
    public final String f120683b;

    public k9s(hz80 hz80Var, String str) {
        this.f120682a = hz80Var;
        this.f120683b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9s)) {
            return false;
        }
        k9s k9sVar = (k9s) obj;
        return wj50.m88271j(this.f120682a, k9sVar.f120682a) && wj50.m88271j(this.f120683b, k9sVar.f120683b);
    }

    public final int hashCode() {
        int iHashCode = this.f120682a.hashCode() * 31;
        String str = this.f120683b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
