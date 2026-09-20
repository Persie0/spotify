package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bd41 {

    /* JADX INFO: renamed from: a */
    public final String f26010a;

    /* JADX INFO: renamed from: b */
    public final String f26011b;

    public bd41(String str, String str2) {
        this.f26010a = str;
        this.f26011b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd41)) {
            return false;
        }
        bd41 bd41Var = (bd41) obj;
        return wj50.m88271j(this.f26010a, bd41Var.f26010a) && wj50.m88271j(this.f26011b, bd41Var.f26011b);
    }

    public final int hashCode() {
        int iHashCode = this.f26010a.hashCode() * 31;
        String str = this.f26011b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
