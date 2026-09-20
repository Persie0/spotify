package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w9e0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f249165a;

    public w9e0(boolean z) {
        this.f249165a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9e0) && this.f249165a == ((w9e0) obj).f249165a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249165a);
    }
}
