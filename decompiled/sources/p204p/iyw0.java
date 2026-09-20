package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iyw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f107085a;

    public iyw0(boolean z) {
        this.f107085a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyw0) && this.f107085a == ((iyw0) obj).f107085a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107085a);
    }
}
