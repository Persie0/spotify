package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e270 implements h270 {

    /* JADX INFO: renamed from: a */
    public final boolean f55382a;

    public e270(boolean z) {
        this.f55382a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e270) && this.f55382a == ((e270) obj).f55382a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55382a);
    }
}
