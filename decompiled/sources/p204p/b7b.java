package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b7b implements c7b {

    /* JADX INFO: renamed from: a */
    public final String f24202a;

    /* JADX INFO: renamed from: b */
    public final String f24203b;

    /* JADX INFO: renamed from: c */
    public final int f24204c;

    public /* synthetic */ b7b(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 2 : 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7b)) {
            return false;
        }
        b7b b7bVar = (b7b) obj;
        return wj50.m88271j(this.f24202a, b7bVar.f24202a) && wj50.m88271j(this.f24203b, b7bVar.f24203b) && this.f24204c == b7bVar.f24204c;
    }

    public final int hashCode() {
        int iHashCode = this.f24202a.hashCode() * 31;
        String str = this.f24203b;
        return edb.m38547C(this.f24204c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public b7b(String str, String str2, int i, edb edbVar) {
        this.f24202a = str;
        this.f24203b = str2;
        this.f24204c = i;
    }
}
