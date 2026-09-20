package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f115631a;

    public jsy0(boolean z) {
        this.f115631a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsy0) && this.f115631a == ((jsy0) obj).f115631a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115631a);
    }
}
