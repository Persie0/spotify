package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ap50 {

    /* JADX INFO: renamed from: a */
    public final boolean f17837a;

    public ap50(boolean z) {
        this.f17837a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap50) && this.f17837a == ((ap50) obj).f17837a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17837a);
    }
}
