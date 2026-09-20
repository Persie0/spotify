package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fft implements tmt {

    /* JADX INFO: renamed from: a */
    public final int f69085a;

    public fft(int i) {
        this.f69085a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fft) && this.f69085a == ((fft) obj).f69085a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69085a);
    }
}
