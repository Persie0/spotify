package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l000 {

    /* JADX INFO: renamed from: a */
    public final int f128249a;

    public final boolean equals(Object obj) {
        if (obj instanceof l000) {
            return this.f128249a == ((l000) obj).f128249a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128249a);
    }

    public final String toString() {
        return dq60.m36613m("FontWeight(value=", this.f128249a, ')');
    }
}
