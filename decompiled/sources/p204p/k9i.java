package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k9i extends nai {

    /* JADX INFO: renamed from: a */
    public final boolean f120591a;

    public k9i(boolean z) {
        this.f120591a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9i) && this.f120591a == ((k9i) obj).f120591a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120591a);
    }
}
