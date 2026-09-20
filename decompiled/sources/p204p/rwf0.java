package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rwf0 implements cxf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f203337a;

    public rwf0(boolean z) {
        this.f203337a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwf0) && this.f203337a == ((rwf0) obj).f203337a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203337a);
    }
}
