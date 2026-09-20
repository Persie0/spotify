package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ogc0 extends qgc0 {

    /* JADX INFO: renamed from: a */
    public final int f165087a;

    public ogc0(int i) {
        this.f165087a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogc0) && this.f165087a == ((ogc0) obj).f165087a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f165087a);
    }
}
