package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wtv0 extends buv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f255023a;

    public wtv0(boolean z) {
        this.f255023a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtv0) && this.f255023a == ((wtv0) obj).f255023a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255023a);
    }
}
