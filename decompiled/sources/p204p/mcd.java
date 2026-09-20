package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mcd implements rcd {

    /* JADX INFO: renamed from: a */
    public final String f142130a;

    /* JADX INFO: renamed from: b */
    public final String f142131b;

    public mcd(String str, String str2) {
        this.f142130a = str;
        this.f142131b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcd)) {
            return false;
        }
        mcd mcdVar = (mcd) obj;
        return wj50.m88271j(this.f142130a, mcdVar.f142130a) && wj50.m88271j(this.f142131b, mcdVar.f142131b);
    }

    public final int hashCode() {
        int iHashCode = this.f142130a.hashCode() * 31;
        String str = this.f142131b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
