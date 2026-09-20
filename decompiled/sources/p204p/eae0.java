package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eae0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57645a;

    public eae0(boolean z) {
        this.f57645a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eae0) && this.f57645a == ((eae0) obj).f57645a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57645a);
    }
}
