package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xu50 {

    /* JADX INFO: renamed from: a */
    public final int f266006a;

    /* JADX INFO: renamed from: b */
    public final int f266007b;

    /* JADX INFO: renamed from: c */
    public final int f266008c;

    public xu50(int i, int i2, int i3) {
        this.f266006a = i;
        this.f266007b = i2;
        this.f266008c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu50)) {
            return false;
        }
        xu50 xu50Var = (xu50) obj;
        return this.f266006a == xu50Var.f266006a && this.f266007b == xu50Var.f266007b && this.f266008c == xu50Var.f266008c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f266008c) + mt60.m62800g(this.f266007b, Integer.hashCode(this.f266006a) * 31, 31);
    }
}
