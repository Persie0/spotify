package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bpf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29447a;

    public bpf0(boolean z) {
        this.f29447a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpf0) && this.f29447a == ((bpf0) obj).f29447a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29447a);
    }
}
