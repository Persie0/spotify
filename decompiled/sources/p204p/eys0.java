package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eys0 {

    /* JADX INFO: renamed from: a */
    public final int f64159a;

    public eys0(int i) {
        this.f64159a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eys0) && this.f64159a == ((eys0) obj).f64159a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64159a);
    }
}
