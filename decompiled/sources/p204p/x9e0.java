package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x9e0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259341a;

    public x9e0(boolean z) {
        this.f259341a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9e0) && this.f259341a == ((x9e0) obj).f259341a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259341a);
    }
}
