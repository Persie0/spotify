package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class udr implements wdr {

    /* JADX INFO: renamed from: a */
    public final boolean f229299a;

    public udr(boolean z) {
        this.f229299a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udr) && this.f229299a == ((udr) obj).f229299a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229299a);
    }
}
