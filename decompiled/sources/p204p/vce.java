package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vce {

    /* JADX INFO: renamed from: a */
    public final int f240112a;

    /* JADX INFO: renamed from: b */
    public final int f240113b;

    public vce(int i, int i2) {
        this.f240112a = i;
        this.f240113b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m85183a() {
        return this.f240112a;
    }

    /* JADX INFO: renamed from: b */
    public final int m85184b() {
        return this.f240113b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vce)) {
            return false;
        }
        vce vceVar = (vce) obj;
        return this.f240112a == vceVar.f240112a && this.f240113b == vceVar.f240113b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f240113b) + (Integer.hashCode(this.f240112a) * 31);
    }
}
