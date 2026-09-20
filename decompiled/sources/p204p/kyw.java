package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kyw implements z1x {

    /* JADX INFO: renamed from: a */
    public final boolean f127928a;

    public kyw(boolean z) {
        this.f127928a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyw) && this.f127928a == ((kyw) obj).f127928a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127928a);
    }
}
