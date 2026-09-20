package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mkm0 extends kjg1 {

    /* JADX INFO: renamed from: c */
    public final int f144605c;

    /* JADX INFO: renamed from: d */
    public final int f144606d;

    public mkm0(int i, int i2) {
        this.f144605c = i;
        this.f144606d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkm0)) {
            return false;
        }
        mkm0 mkm0Var = (mkm0) obj;
        return this.f144605c == mkm0Var.f144605c && this.f144606d == mkm0Var.f144606d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144606d) + (Integer.hashCode(this.f144605c) * 31);
    }
}
