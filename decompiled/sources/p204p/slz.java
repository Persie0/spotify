package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class slz {

    /* JADX INFO: renamed from: a */
    public float f210524a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slz) && Float.compare(this.f210524a, ((slz) obj).f210524a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f210524a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.f210524a, ')');
    }
}
