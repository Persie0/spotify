package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r5s implements v5s {

    /* JADX INFO: renamed from: a */
    public final String f196110a;

    /* JADX INFO: renamed from: b */
    public final String f196111b;

    public r5s(String str, String str2) {
        this.f196110a = str;
        this.f196111b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5s)) {
            return false;
        }
        r5s r5sVar = (r5s) obj;
        return wj50.m88271j(this.f196110a, r5sVar.f196110a) && wj50.m88271j(this.f196111b, r5sVar.f196111b);
    }

    public final int hashCode() {
        int iHashCode = this.f196110a.hashCode() * 31;
        String str = this.f196111b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
