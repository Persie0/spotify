package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yor0 implements lpr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274719a;

    public yor0(boolean z) {
        this.f274719a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yor0) && this.f274719a == ((yor0) obj).f274719a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274719a);
    }
}
