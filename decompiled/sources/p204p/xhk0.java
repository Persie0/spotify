package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xhk0 implements yhk0 {

    /* JADX INFO: renamed from: a */
    public final int f261664a;

    public final boolean equals(Object obj) {
        if (obj instanceof xhk0) {
            return this.f261664a == ((xhk0) obj).f261664a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f261664a);
    }

    public final String toString() {
        return edb.m38563l("StopFailed(errorCode=", this.f261664a, ")");
    }
}
