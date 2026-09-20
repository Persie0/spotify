package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xm50 extends an50 {

    /* JADX INFO: renamed from: a */
    public final boolean f263293a;

    public xm50(boolean z) {
        this.f263293a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm50) && this.f263293a == ((xm50) obj).f263293a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263293a);
    }
}
