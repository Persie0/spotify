package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bzh implements dzh {

    /* JADX INFO: renamed from: a */
    public final boolean f32497a;

    public bzh(boolean z) {
        this.f32497a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzh) && this.f32497a == ((bzh) obj).f32497a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32497a);
    }
}
