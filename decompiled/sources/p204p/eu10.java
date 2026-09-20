package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eu10 {

    /* JADX INFO: renamed from: a */
    public final boolean f62850a;

    public eu10(boolean z) {
        this.f62850a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu10) && this.f62850a == ((eu10) obj).f62850a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62850a);
    }
}
