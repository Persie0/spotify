package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e0t implements h0t {

    /* JADX INFO: renamed from: a */
    public final boolean f55030a;

    public e0t(boolean z) {
        this.f55030a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0t) && this.f55030a == ((e0t) obj).f55030a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55030a);
    }
}
