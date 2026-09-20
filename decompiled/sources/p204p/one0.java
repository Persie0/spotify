package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class one0 implements rne0 {

    /* JADX INFO: renamed from: a */
    public final boolean f167242a;

    public one0(boolean z) {
        this.f167242a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof one0) && this.f167242a == ((one0) obj).f167242a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167242a);
    }
}
