package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uas {

    /* JADX INFO: renamed from: a */
    public final String f228541a;

    /* JADX INFO: renamed from: b */
    public final String f228542b;

    /* JADX INFO: renamed from: c */
    public final xas f228543c;

    public uas(String str, String str2, xas xasVar) {
        this.f228541a = str;
        this.f228542b = str2;
        this.f228543c = xasVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uas)) {
            return false;
        }
        uas uasVar = (uas) obj;
        return wj50.m88271j(this.f228541a, uasVar.f228541a) && wj50.m88271j(this.f228542b, uasVar.f228542b) && this.f228543c == uasVar.f228543c;
    }

    public final int hashCode() {
        String str = this.f228541a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f228542b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        xas xasVar = this.f228543c;
        return iHashCode2 + (xasVar != null ? xasVar.hashCode() : 0);
    }
}
