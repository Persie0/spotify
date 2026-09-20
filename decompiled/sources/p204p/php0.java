package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class php0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final int f177704a;

    public php0(int i) {
        this.f177704a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof php0) && this.f177704a == ((php0) obj).f177704a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177704a);
    }
}
