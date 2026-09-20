package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bcx extends gcx {

    /* JADX INFO: renamed from: a */
    public final boolean f25950a;

    public bcx(boolean z) {
        this.f25950a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcx) && this.f25950a == ((bcx) obj).f25950a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25950a);
    }
}
