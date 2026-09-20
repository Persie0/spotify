package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sss0 implements wss0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213711a;

    public sss0(boolean z) {
        this.f213711a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sss0) && this.f213711a == ((sss0) obj).f213711a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213711a);
    }
}
