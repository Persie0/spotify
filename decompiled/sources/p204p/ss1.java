package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ss1 implements vs1 {

    /* JADX INFO: renamed from: a */
    public final int f213450a;

    public ss1(int i) {
        this.f213450a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss1) && this.f213450a == ((ss1) obj).f213450a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213450a);
    }
}
