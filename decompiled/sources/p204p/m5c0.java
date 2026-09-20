package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140184a;

    public m5c0(boolean z) {
        this.f140184a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5c0) && this.f140184a == ((m5c0) obj).f140184a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140184a);
    }
}
