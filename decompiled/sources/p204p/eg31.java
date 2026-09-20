package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class eg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final boolean f59208a;

    public eg31(boolean z) {
        this.f59208a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg31) && this.f59208a == ((eg31) obj).f59208a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59208a);
    }
}
