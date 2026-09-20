package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h4s implements k4s {

    /* JADX INFO: renamed from: a */
    public final String f87634a;

    /* JADX INFO: renamed from: b */
    public final String f87635b;

    public h4s(String str, String str2) {
        this.f87634a = str;
        this.f87635b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4s)) {
            return false;
        }
        h4s h4sVar = (h4s) obj;
        return wj50.m88271j(this.f87634a, h4sVar.f87634a) && wj50.m88271j(this.f87635b, h4sVar.f87635b);
    }

    public final int hashCode() {
        int iHashCode = this.f87634a.hashCode() * 31;
        String str = this.f87635b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
