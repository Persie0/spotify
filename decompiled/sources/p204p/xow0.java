package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xow0 {

    /* JADX INFO: renamed from: a */
    public final boolean f264376a;

    public xow0(boolean z) {
        this.f264376a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xow0) && this.f264376a == ((xow0) obj).f264376a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264376a);
    }
}
