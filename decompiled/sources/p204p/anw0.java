package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class anw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f17510a;

    public anw0(boolean z) {
        this.f17510a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anw0) && this.f17510a == ((anw0) obj).f17510a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17510a);
    }
}
