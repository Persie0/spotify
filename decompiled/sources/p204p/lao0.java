package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lao0 {

    /* JADX INFO: renamed from: a */
    public final boolean f131382a;

    public lao0(boolean z) {
        this.f131382a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lao0) && this.f131382a == ((lao0) obj).f131382a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131382a);
    }
}
