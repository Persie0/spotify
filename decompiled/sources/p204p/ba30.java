package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ba30 extends hxh {

    /* JADX INFO: renamed from: c */
    public final int f25076c;

    public ba30(int i) {
        this.f25076c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba30) && this.f25076c == ((ba30) obj).f25076c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f25076c);
    }
}
