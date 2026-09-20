package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tuk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223871a;

    public tuk0(boolean z) {
        this.f223871a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuk0) && this.f223871a == ((tuk0) obj).f223871a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223871a);
    }
}
