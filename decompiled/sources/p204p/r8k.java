package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r8k {

    /* JADX INFO: renamed from: a */
    public final String f196805a;

    /* JADX INFO: renamed from: b */
    public final String f196806b;

    /* JADX INFO: renamed from: c */
    public final boolean f196807c;

    public r8k(String str, String str2, boolean z) {
        this.f196805a = str;
        this.f196806b = str2;
        this.f196807c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8k)) {
            return false;
        }
        r8k r8kVar = (r8k) obj;
        return wj50.m88271j(this.f196805a, r8kVar.f196805a) && wj50.m88271j(this.f196806b, r8kVar.f196806b) && this.f196807c == r8kVar.f196807c;
    }

    public final int hashCode() {
        String str = this.f196805a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f196806b;
        return Boolean.hashCode(this.f196807c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
