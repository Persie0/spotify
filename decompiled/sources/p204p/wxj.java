package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wxj implements eyj {

    /* JADX INFO: renamed from: a */
    public final String f256046a;

    /* JADX INFO: renamed from: b */
    public final int f256047b;

    public wxj(String str, int i) {
        this.f256046a = str;
        this.f256047b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxj)) {
            return false;
        }
        wxj wxjVar = (wxj) obj;
        return wj50.m88271j(this.f256046a, wxjVar.f256046a) && this.f256047b == wxjVar.f256047b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f256047b) + (this.f256046a.hashCode() * 31);
    }
}
