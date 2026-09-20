package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aip0 implements bip0 {

    /* JADX INFO: renamed from: a */
    public final int f16073a;

    public aip0(int i) {
        this.f16073a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aip0) && this.f16073a == ((aip0) obj).f16073a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16073a);
    }
}
