package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iol {

    /* JADX INFO: renamed from: a */
    public final String f104241a;

    /* JADX INFO: renamed from: b */
    public final String f104242b;

    /* JADX INFO: renamed from: c */
    public final boolean f104243c;

    public iol(String str, String str2, boolean z) {
        this.f104241a = str;
        this.f104242b = str2;
        this.f104243c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iol)) {
            return false;
        }
        iol iolVar = (iol) obj;
        return wj50.m88271j(this.f104241a, iolVar.f104241a) && wj50.m88271j(this.f104242b, iolVar.f104242b) && this.f104243c == iolVar.f104243c;
    }

    public final int hashCode() {
        String str = this.f104241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104242b;
        return Boolean.hashCode(this.f104243c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
