package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zlx {

    /* JADX INFO: renamed from: a */
    public final boolean f284093a;

    /* JADX INFO: renamed from: b */
    public final boolean f284094b;

    public zlx(boolean z, boolean z2) {
        this.f284093a = z;
        this.f284094b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlx)) {
            return false;
        }
        zlx zlxVar = (zlx) obj;
        return this.f284093a == zlxVar.f284093a && this.f284094b == zlxVar.f284094b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(Boolean.hashCode(this.f284093a) * 31, 31, this.f284094b);
    }
}
