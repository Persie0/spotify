package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g48 extends hhg1 {

    /* JADX INFO: renamed from: d */
    public final boolean f76359d;

    public g48(boolean z) {
        this.f76359d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g48) && this.f76359d == ((g48) obj).f76359d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76359d);
    }
}
