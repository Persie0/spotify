package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a2c implements i2c {

    /* JADX INFO: renamed from: a */
    public final z0r f11621a;

    /* JADX INFO: renamed from: b */
    public final int f11622b;

    public a2c(z0r z0rVar, int i) {
        this.f11621a = z0rVar;
        this.f11622b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2c)) {
            return false;
        }
        a2c a2cVar = (a2c) obj;
        return wj50.m88271j(this.f11621a, a2cVar.f11621a) && this.f11622b == a2cVar.f11622b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11622b) + (this.f11621a.hashCode() * 31);
    }
}
