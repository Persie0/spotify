package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class el3 {

    /* JADX INFO: renamed from: a */
    public final boolean f60574a;

    public el3(boolean z) {
        this.f60574a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el3) && this.f60574a == ((el3) obj).f60574a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60574a);
    }
}
