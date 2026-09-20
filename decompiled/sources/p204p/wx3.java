package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wx3 {

    /* JADX INFO: renamed from: a */
    public final boolean f255922a;

    public wx3(boolean z) {
        this.f255922a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx3) && this.f255922a == ((wx3) obj).f255922a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255922a);
    }
}
