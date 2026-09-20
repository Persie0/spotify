package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class myt0 {

    /* JADX INFO: renamed from: a */
    public final String f148519a;

    /* JADX INFO: renamed from: b */
    public final String f148520b;

    public myt0(String str, String str2) {
        this.f148519a = str;
        this.f148520b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myt0)) {
            return false;
        }
        myt0 myt0Var = (myt0) obj;
        return wj50.m88271j(this.f148519a, myt0Var.f148519a) && wj50.m88271j(this.f148520b, myt0Var.f148520b);
    }

    public final int hashCode() {
        String str = this.f148519a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f148520b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
