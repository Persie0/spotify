package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bzn0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32541a;

    public bzn0(boolean z) {
        this.f32541a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzn0) && this.f32541a == ((bzn0) obj).f32541a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32541a);
    }
}
