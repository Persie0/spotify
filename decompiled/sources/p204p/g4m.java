package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g4m {

    /* JADX INFO: renamed from: a */
    public final boolean f76439a;

    public g4m(boolean z) {
        this.f76439a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4m) && this.f76439a == ((g4m) obj).f76439a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76439a);
    }
}
