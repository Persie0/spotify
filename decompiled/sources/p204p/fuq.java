package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fuq {

    /* JADX INFO: renamed from: a */
    public final boolean f73548a;

    public final boolean equals(Object obj) {
        if (obj instanceof fuq) {
            return this.f73548a == ((fuq) obj).f73548a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73548a);
    }

    public final String toString() {
        return "DescriptionCollapseExpandState(isExpanded=" + this.f73548a + ")";
    }
}
