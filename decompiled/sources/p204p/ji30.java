package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ji30 {

    /* JADX INFO: renamed from: a */
    public final int f112633a;

    public ji30(int i) {
        this.f112633a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji30) && this.f112633a == ((ji30) obj).f112633a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f112633a);
    }
}
