package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oht {

    /* JADX INFO: renamed from: a */
    public final String f165537a;

    /* JADX INFO: renamed from: b */
    public final cvt f165538b;

    public oht(String str, cvt cvtVar) {
        this.f165537a = str;
        this.f165538b = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oht)) {
            return false;
        }
        oht ohtVar = (oht) obj;
        return wj50.m88271j(this.f165537a, ohtVar.f165537a) && wj50.m88271j(this.f165538b, ohtVar.f165538b);
    }

    public final int hashCode() {
        int iHashCode = this.f165537a.hashCode() * 31;
        cvt cvtVar = this.f165538b;
        return iHashCode + (cvtVar == null ? 0 : cvtVar.hashCode());
    }
}
