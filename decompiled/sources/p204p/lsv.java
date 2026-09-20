package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lsv {

    /* JADX INFO: renamed from: a */
    public final String f136616a;

    public final boolean equals(Object obj) {
        if (obj instanceof lsv) {
            return wj50.m88271j(this.f136616a, ((lsv) obj).f136616a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f136616a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("SegmentUri(value=", this.f136616a, ")");
    }
}
