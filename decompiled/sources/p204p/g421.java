package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g421 extends o2h1 {

    /* JADX INFO: renamed from: c */
    public final boolean f76328c;

    public g421(boolean z) {
        this.f76328c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g421) && this.f76328c == ((g421) obj).f76328c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76328c);
    }
}
