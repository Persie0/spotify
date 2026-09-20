package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a4z implements hwf {

    /* JADX INFO: renamed from: a */
    public final int f12351a;

    /* JADX INFO: renamed from: b */
    public final int f12352b;

    public a4z(int i) {
        this.f12351a = i;
        this.f12352b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4z)) {
            return false;
        }
        a4z a4zVar = (a4z) obj;
        return this.f12351a == a4zVar.f12351a && this.f12352b == a4zVar.f12352b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12352b) + (Integer.hashCode(this.f12351a) * 31);
    }
}
