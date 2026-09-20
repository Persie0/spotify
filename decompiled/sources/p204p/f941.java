package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f941 {

    /* JADX INFO: renamed from: a */
    public final boolean f67172a;

    public f941(boolean z) {
        this.f67172a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f941) && this.f67172a == ((f941) obj).f67172a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67172a);
    }
}
