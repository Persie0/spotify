package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qyx extends syx {

    /* JADX INFO: renamed from: a */
    public final boolean f194052a;

    public qyx(boolean z) {
        this.f194052a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qyx) && this.f194052a == ((qyx) obj).f194052a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194052a);
    }
}
