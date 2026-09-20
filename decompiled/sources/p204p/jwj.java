package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jwj {

    /* JADX INFO: renamed from: a */
    public final boolean f116648a;

    public jwj(boolean z) {
        this.f116648a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwj) && this.f116648a == ((jwj) obj).f116648a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116648a);
    }
}
