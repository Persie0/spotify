package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n1j {

    /* JADX INFO: renamed from: a */
    public final boolean f149456a;

    /* JADX INFO: renamed from: b */
    public final boolean f149457b;

    public n1j(boolean z, boolean z2) {
        this.f149456a = z;
        this.f149457b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1j)) {
            return false;
        }
        n1j n1jVar = (n1j) obj;
        return this.f149456a == n1jVar.f149456a && this.f149457b == n1jVar.f149457b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149457b) + (Boolean.hashCode(this.f149456a) * 31);
    }
}
