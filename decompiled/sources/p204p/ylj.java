package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ylj implements zlj {

    /* JADX INFO: renamed from: a */
    public final int f274033a;

    /* JADX INFO: renamed from: b */
    public final long f274034b;

    public ylj(int i, long j) {
        this.f274033a = i;
        this.f274034b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylj)) {
            return false;
        }
        ylj yljVar = (ylj) obj;
        if (this.f274033a != yljVar.f274033a) {
            return false;
        }
        long j = yljVar.f274034b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f274034b, j);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f274033a) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f274034b) + iM38547C;
    }
}
