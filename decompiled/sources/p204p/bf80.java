package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bf80 {

    /* JADX INFO: renamed from: a */
    public final boolean f26638a;

    public bf80(boolean z) {
        this.f26638a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf80) && this.f26638a == ((bf80) obj).f26638a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26638a);
    }
}
