package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class shk0 implements yhk0 {

    /* JADX INFO: renamed from: a */
    public final int f209232a;

    public final boolean equals(Object obj) {
        if (obj instanceof shk0) {
            return this.f209232a == ((shk0) obj).f209232a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f209232a);
    }

    public final String toString() {
        return edb.m38563l("FailedToResolveService(errorCode=", this.f209232a, ")");
    }
}
