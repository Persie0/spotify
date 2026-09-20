package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class buu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31221a;

    public buu0(boolean z) {
        this.f31221a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buu0) && this.f31221a == ((buu0) obj).f31221a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31221a);
    }
}
