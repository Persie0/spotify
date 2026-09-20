package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jrb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f115131a;

    public jrb1(boolean z) {
        this.f115131a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrb1) && this.f115131a == ((jrb1) obj).f115131a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115131a);
    }
}
