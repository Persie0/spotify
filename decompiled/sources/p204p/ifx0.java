package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ifx0 implements lfx0 {

    /* JADX INFO: renamed from: a */
    public final boolean f101838a;

    public ifx0(boolean z) {
        this.f101838a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifx0) && this.f101838a == ((ifx0) obj).f101838a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101838a);
    }
}
