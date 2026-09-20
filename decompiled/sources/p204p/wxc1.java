package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f256007a;

    public wxc1(boolean z) {
        this.f256007a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxc1) && this.f256007a == ((wxc1) obj).f256007a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256007a);
    }
}
