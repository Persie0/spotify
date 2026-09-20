package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sm80 {

    /* JADX INFO: renamed from: a */
    public final String f210582a;

    /* JADX INFO: renamed from: b */
    public final String f210583b;

    public sm80(String str, String str2) {
        this.f210582a = str;
        this.f210583b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm80)) {
            return false;
        }
        sm80 sm80Var = (sm80) obj;
        return wj50.m88271j(this.f210582a, sm80Var.f210582a) && wj50.m88271j(this.f210583b, sm80Var.f210583b);
    }

    public final int hashCode() {
        int iHashCode = this.f210582a.hashCode() * 31;
        String str = this.f210583b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
