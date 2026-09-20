package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y1y {

    /* JADX INFO: renamed from: a */
    public final boolean f268415a;

    /* JADX INFO: renamed from: b */
    public final boolean f268416b;

    public y1y(boolean z, boolean z2) {
        this.f268415a = z;
        this.f268416b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1y)) {
            return false;
        }
        y1y y1yVar = (y1y) obj;
        return this.f268415a == y1yVar.f268415a && this.f268416b == y1yVar.f268416b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268416b) + (Boolean.hashCode(this.f268415a) * 31);
    }
}
