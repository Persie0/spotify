package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tuw implements k3x {

    /* JADX INFO: renamed from: a */
    public final String f223964a;

    /* JADX INFO: renamed from: b */
    public final String f223965b;

    public tuw(String str, String str2) {
        this.f223964a = str;
        this.f223965b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuw)) {
            return false;
        }
        tuw tuwVar = (tuw) obj;
        return wj50.m88271j(this.f223964a, tuwVar.f223964a) && wj50.m88271j(this.f223965b, tuwVar.f223965b);
    }

    public final int hashCode() {
        int iHashCode = this.f223964a.hashCode() * 31;
        String str = this.f223965b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
