package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xtu0 implements auu0 {

    /* JADX INFO: renamed from: a */
    public final int f265930a;

    public xtu0(int i) {
        this.f265930a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtu0) && this.f265930a == ((xtu0) obj).f265930a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265930a);
    }
}
