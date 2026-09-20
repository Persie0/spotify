package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gx50 {

    /* JADX INFO: renamed from: a */
    public final int f85187a;

    public gx50(int i) {
        this.f85187a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx50) && this.f85187a == ((gx50) obj).f85187a;
    }

    public final int hashCode() {
        int i = this.f85187a;
        if (i == 0) {
            return 0;
        }
        return edb.m38547C(i);
    }
}
