package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t5s implements v5s {

    /* JADX INFO: renamed from: a */
    public final String f217345a;

    /* JADX INFO: renamed from: b */
    public final String f217346b;

    public t5s(String str, String str2) {
        this.f217345a = str;
        this.f217346b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5s)) {
            return false;
        }
        t5s t5sVar = (t5s) obj;
        return wj50.m88271j(this.f217345a, t5sVar.f217345a) && wj50.m88271j(this.f217346b, t5sVar.f217346b);
    }

    public final int hashCode() {
        int iHashCode = this.f217345a.hashCode() * 31;
        String str = this.f217346b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
