package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fvt implements hvt {

    /* JADX INFO: renamed from: a */
    public final hgo f73858a;

    public fvt(hgo hgoVar) {
        this.f73858a = hgoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvt) && this.f73858a.equals(((fvt) obj).f73858a);
    }

    public final int hashCode() {
        return this.f73858a.hashCode();
    }
}
