package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rtu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f202655a;

    public rtu0(boolean z) {
        this.f202655a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtu0) && this.f202655a == ((rtu0) obj).f202655a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202655a);
    }
}
