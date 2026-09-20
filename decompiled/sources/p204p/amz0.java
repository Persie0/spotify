package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class amz0 implements bmz0 {

    /* JADX INFO: renamed from: a */
    public final int f17234a;

    public amz0(int i) {
        this.f17234a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amz0) && this.f17234a == ((amz0) obj).f17234a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17234a);
    }
}
