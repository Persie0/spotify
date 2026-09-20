package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m2y {

    /* JADX INFO: renamed from: a */
    public final boolean f139475a;

    /* JADX INFO: renamed from: b */
    public final boolean f139476b;

    public m2y(boolean z, boolean z2) {
        this.f139475a = z;
        this.f139476b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2y)) {
            return false;
        }
        m2y m2yVar = (m2y) obj;
        return this.f139475a == m2yVar.f139475a && this.f139476b == m2yVar.f139476b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139476b) + (Boolean.hashCode(this.f139475a) * 31);
    }
}
