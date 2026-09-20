package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140760a;

    public m7c0(boolean z) {
        this.f140760a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7c0) && this.f140760a == ((m7c0) obj).f140760a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140760a);
    }
}
