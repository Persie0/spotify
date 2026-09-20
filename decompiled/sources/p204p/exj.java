package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class exj {

    /* JADX INFO: renamed from: a */
    public final boolean f63783a;

    public exj(boolean z) {
        this.f63783a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exj) && this.f63783a == ((exj) obj).f63783a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63783a);
    }
}
