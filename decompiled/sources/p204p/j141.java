package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final boolean f107638a;

    public j141(boolean z) {
        this.f107638a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j141) && this.f107638a == ((j141) obj).f107638a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107638a);
    }
}
