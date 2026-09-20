package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t8k {

    /* JADX INFO: renamed from: a */
    public final String f218094a;

    /* JADX INFO: renamed from: b */
    public final String f218095b;

    /* JADX INFO: renamed from: c */
    public final boolean f218096c;

    public t8k(String str, String str2, boolean z) {
        this.f218094a = str;
        this.f218095b = str2;
        this.f218096c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8k)) {
            return false;
        }
        t8k t8kVar = (t8k) obj;
        return wj50.m88271j(this.f218094a, t8kVar.f218094a) && wj50.m88271j(this.f218095b, t8kVar.f218095b) && this.f218096c == t8kVar.f218096c;
    }

    public final int hashCode() {
        String str = this.f218094a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f218095b;
        return Boolean.hashCode(this.f218096c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
