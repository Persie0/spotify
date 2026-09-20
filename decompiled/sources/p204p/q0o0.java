package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q0o0 implements y0o0 {

    /* JADX INFO: renamed from: a */
    public final int f184040a;

    public q0o0(int i) {
        this.f184040a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0o0) && this.f184040a == ((q0o0) obj).f184040a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184040a);
    }
}
