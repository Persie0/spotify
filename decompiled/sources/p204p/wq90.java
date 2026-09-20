package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wq90 extends hr90 {

    /* JADX INFO: renamed from: a */
    public final boolean f253951a;

    public wq90(boolean z) {
        this.f253951a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq90) && this.f253951a == ((wq90) obj).f253951a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253951a);
    }
}
