package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g270 implements h270 {

    /* JADX INFO: renamed from: a */
    public final boolean f75860a;

    public g270(boolean z) {
        this.f75860a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g270) && this.f75860a == ((g270) obj).f75860a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75860a);
    }
}
