package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class htv {

    /* JADX INFO: renamed from: a */
    public final boolean f95188a;

    public htv(boolean z) {
        this.f95188a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htv) && this.f95188a == ((htv) obj).f95188a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95188a);
    }
}
