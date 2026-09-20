package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final boolean f266685a;

    public xwh(boolean z) {
        this.f266685a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwh) && this.f266685a == ((xwh) obj).f266685a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266685a);
    }
}
