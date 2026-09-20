package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y7b extends a8b {

    /* JADX INFO: renamed from: a */
    public final boolean f270006a;

    public y7b(boolean z) {
        this.f270006a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7b) && this.f270006a == ((y7b) obj).f270006a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270006a);
    }
}
