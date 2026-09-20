package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fjz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f70426a;

    public fjz0(boolean z) {
        this.f70426a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjz0) && this.f70426a == ((fjz0) obj).f70426a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70426a);
    }
}
