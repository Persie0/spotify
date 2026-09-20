package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class acw0 implements jcw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14470a;

    public acw0(boolean z) {
        this.f14470a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acw0) && this.f14470a == ((acw0) obj).f14470a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14470a);
    }
}
