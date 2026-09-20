package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ocy {

    /* JADX INFO: renamed from: a */
    public final String f164015a;

    /* JADX INFO: renamed from: b */
    public final boolean f164016b;

    /* JADX INFO: renamed from: c */
    public final int f164017c;

    public ocy(String str, boolean z, int i) {
        this.f164015a = str;
        this.f164016b = z;
        this.f164017c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocy)) {
            return false;
        }
        ocy ocyVar = (ocy) obj;
        return wj50.m88271j(this.f164015a, ocyVar.f164015a) && this.f164016b == ocyVar.f164016b && this.f164017c == ocyVar.f164017c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f164017c) + ((((Boolean.hashCode(this.f164016b) + (this.f164015a.hashCode() * 31)) * 31) + 1577933540) * 31);
    }
}
