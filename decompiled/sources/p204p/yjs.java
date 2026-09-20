package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yjs implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f273449a;

    public yjs(boolean z) {
        this.f273449a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjs) && this.f273449a == ((yjs) obj).f273449a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273449a);
    }
}
