package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c4q {

    /* JADX INFO: renamed from: a */
    public final String f33991a;

    /* JADX INFO: renamed from: b */
    public final String f33992b;

    public c4q(String str, String str2) {
        this.f33991a = str;
        this.f33992b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4q)) {
            return false;
        }
        c4q c4qVar = (c4q) obj;
        return wj50.m88271j(this.f33991a, c4qVar.f33991a) && wj50.m88271j(this.f33992b, c4qVar.f33992b);
    }

    public final int hashCode() {
        int iHashCode = this.f33991a.hashCode() * 31;
        String str = this.f33992b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
