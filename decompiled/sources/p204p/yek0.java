package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yek0 implements bfk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f272005a;

    public yek0(boolean z) {
        this.f272005a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93533a() {
        return this.f272005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yek0) && this.f272005a == ((yek0) obj).f272005a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272005a) + (Boolean.hashCode(true) * 31);
    }
}
