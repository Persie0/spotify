package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ni70 {

    /* JADX INFO: renamed from: a */
    public final boolean f154194a;

    public ni70(boolean z) {
        this.f154194a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni70) && this.f154194a == ((ni70) obj).f154194a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154194a);
    }
}
