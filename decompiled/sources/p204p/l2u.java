package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l2u extends fn1 {

    /* JADX INFO: renamed from: c */
    public final String f129079c;

    /* JADX INFO: renamed from: d */
    public final String f129080d;

    public l2u(String str, String str2) {
        this.f129079c = str;
        this.f129080d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2u)) {
            return false;
        }
        l2u l2uVar = (l2u) obj;
        return wj50.m88271j(this.f129079c, l2uVar.f129079c) && wj50.m88271j(this.f129080d, l2uVar.f129080d);
    }

    public final int hashCode() {
        int iHashCode = this.f129079c.hashCode() * 31;
        String str = this.f129080d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
