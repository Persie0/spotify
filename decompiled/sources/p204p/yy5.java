package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yy5 {

    /* JADX INFO: renamed from: a */
    public final String f277405a;

    /* JADX INFO: renamed from: b */
    public final String f277406b;

    public yy5(String str, String str2) {
        this.f277405a = str;
        this.f277406b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy5)) {
            return false;
        }
        yy5 yy5Var = (yy5) obj;
        return wj50.m88271j(this.f277405a, yy5Var.f277405a) && wj50.m88271j(this.f277406b, yy5Var.f277406b);
    }

    public final int hashCode() {
        int iHashCode = this.f277405a.hashCode() * 31;
        String str = this.f277406b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
