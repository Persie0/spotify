package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nu41 {

    /* JADX INFO: renamed from: a */
    public final boolean f158512a;

    public nu41(boolean z) {
        this.f158512a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nu41) && this.f158512a == ((nu41) obj).f158512a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158512a);
    }
}
