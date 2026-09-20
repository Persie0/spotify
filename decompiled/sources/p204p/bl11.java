package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bl11 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f28057a;

    public bl11(boolean z) {
        this.f28057a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl11) && this.f28057a == ((bl11) obj).f28057a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28057a);
    }
}
