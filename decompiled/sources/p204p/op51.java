package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class op51 implements pp51 {

    /* JADX INFO: renamed from: a */
    public final boolean f167760a;

    public op51(boolean z) {
        this.f167760a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op51) && this.f167760a == ((op51) obj).f167760a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167760a);
    }
}
