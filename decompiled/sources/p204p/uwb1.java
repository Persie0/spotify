package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uwb1 extends pmg1 {

    /* JADX INFO: renamed from: c */
    public final int f234623c;

    public uwb1(int i) {
        this.f234623c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwb1) && this.f234623c == ((uwb1) obj).f234623c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f234623c);
    }
}
