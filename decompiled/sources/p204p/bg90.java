package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bg90 {

    /* JADX INFO: renamed from: a */
    public final boolean f26889a;

    public bg90(boolean z) {
        this.f26889a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg90) && this.f26889a == ((bg90) obj).f26889a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26889a);
    }
}
