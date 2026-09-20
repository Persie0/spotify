package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rxw implements l2x {

    /* JADX INFO: renamed from: a */
    public final boolean f203741a;

    public rxw(boolean z) {
        this.f203741a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxw) && this.f203741a == ((rxw) obj).f203741a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203741a);
    }
}
