package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bc60 {

    /* JADX INFO: renamed from: a */
    public final String f25787a;

    /* JADX INFO: renamed from: b */
    public final String f25788b;

    /* JADX INFO: renamed from: c */
    public final String f25789c;

    public bc60(String str, String str2, String str3) {
        this.f25787a = str;
        this.f25788b = str2;
        this.f25789c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc60)) {
            return false;
        }
        bc60 bc60Var = (bc60) obj;
        return wj50.m88271j(this.f25787a, bc60Var.f25787a) && wj50.m88271j(this.f25788b, bc60Var.f25788b) && wj50.m88271j(this.f25789c, bc60Var.f25789c);
    }

    public final int hashCode() {
        int iHashCode = this.f25787a.hashCode() * 31;
        String str = this.f25788b;
        return this.f25789c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
