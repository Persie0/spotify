package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d5s {

    /* JADX INFO: renamed from: a */
    public final boolean f45484a;

    /* JADX INFO: renamed from: b */
    public final boolean f45485b;

    public d5s(boolean z, boolean z2) {
        this.f45484a = z;
        this.f45485b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5s)) {
            return false;
        }
        d5s d5sVar = (d5s) obj;
        return this.f45484a == d5sVar.f45484a && this.f45485b == d5sVar.f45485b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45485b) + (Boolean.hashCode(this.f45484a) * 31);
    }
}
