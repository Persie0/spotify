package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hpm0 {

    /* JADX INFO: renamed from: a */
    public final String f93815a;

    /* JADX INFO: renamed from: b */
    public final String f93816b;

    public hpm0(String str, String str2) {
        this.f93815a = str;
        this.f93816b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpm0)) {
            return false;
        }
        hpm0 hpm0Var = (hpm0) obj;
        return wj50.m88271j(this.f93815a, hpm0Var.f93815a) && wj50.m88271j(this.f93816b, hpm0Var.f93816b);
    }

    public final int hashCode() {
        String str = this.f93815a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93816b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
