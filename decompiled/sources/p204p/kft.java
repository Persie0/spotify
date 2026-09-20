package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kft {

    /* JADX INFO: renamed from: a */
    public final uj00 f122223a;

    /* JADX INFO: renamed from: b */
    public final boolean f122224b;

    public kft(uj00 uj00Var, boolean z) {
        this.f122223a = uj00Var;
        this.f122224b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kft)) {
            return false;
        }
        kft kftVar = (kft) obj;
        return this.f122223a == kftVar.f122223a && this.f122224b == kftVar.f122224b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122224b) + (this.f122223a.hashCode() * 31);
    }
}
