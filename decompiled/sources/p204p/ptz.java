package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ptz {

    /* JADX INFO: renamed from: a */
    public final String f181276a;

    /* JADX INFO: renamed from: b */
    public final String f181277b;

    public ptz(String str, String str2) {
        this.f181276a = str;
        this.f181277b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptz)) {
            return false;
        }
        ptz ptzVar = (ptz) obj;
        return wj50.m88271j(this.f181276a, ptzVar.f181276a) && wj50.m88271j(this.f181277b, ptzVar.f181277b);
    }

    public final int hashCode() {
        int iHashCode = this.f181276a.hashCode() * 31;
        String str = this.f181277b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
