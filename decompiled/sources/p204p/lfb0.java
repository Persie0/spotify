package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132883a;

    public lfb0(boolean z) {
        this.f132883a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfb0) && this.f132883a == ((lfb0) obj).f132883a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132883a);
    }
}
