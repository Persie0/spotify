package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t10 {

    /* JADX INFO: renamed from: a */
    public final boolean f216046a;

    public final boolean equals(Object obj) {
        if (obj instanceof t10) {
            return this.f216046a == ((t10) obj).f216046a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216046a);
    }

    public final String toString() {
        return "AddButtonFeature(isAddedToLibrary=" + this.f216046a + ")";
    }
}
