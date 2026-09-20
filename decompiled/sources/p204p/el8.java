package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class el8 {

    /* JADX INFO: renamed from: a */
    public final long f60639a;

    public el8(long j) {
        this.f60639a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el8)) {
            return false;
        }
        long j = ((el8) obj).f60639a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f60639a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return edb.m38547C(1) + (Long.hashCode(this.f60639a) * 961);
    }
}
