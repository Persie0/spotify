package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nb8 implements sb8 {

    /* JADX INFO: renamed from: a */
    public final boolean f152207a;

    public nb8(boolean z) {
        this.f152207a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb8) && this.f152207a == ((nb8) obj).f152207a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152207a);
    }
}
