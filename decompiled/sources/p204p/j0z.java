package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j0z implements k0z {

    /* JADX INFO: renamed from: a */
    public final kyy f107581a;

    /* JADX INFO: renamed from: b */
    public final int f107582b;

    public j0z(kyy kyyVar, int i) {
        this.f107581a = kyyVar;
        this.f107582b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0z)) {
            return false;
        }
        j0z j0zVar = (j0z) obj;
        return this.f107581a == j0zVar.f107581a && this.f107582b == j0zVar.f107582b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107582b) + (this.f107581a.hashCode() * 31);
    }
}
