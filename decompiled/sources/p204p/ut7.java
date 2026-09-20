package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ut7 extends wt7 {

    /* JADX INFO: renamed from: a */
    public final boolean f233835a;

    public ut7(boolean z) {
        this.f233835a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut7) && this.f233835a == ((ut7) obj).f233835a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233835a);
    }
}
