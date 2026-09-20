package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wt00 implements du00 {

    /* JADX INFO: renamed from: a */
    public final boolean f254792a;

    public wt00(boolean z) {
        this.f254792a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88902a() {
        return this.f254792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt00) && this.f254792a == ((wt00) obj).f254792a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254792a);
    }
}
