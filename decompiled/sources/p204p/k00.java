package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k00 implements j10 {

    /* JADX INFO: renamed from: a */
    public final int f117831a;

    public k00(int i) {
        this.f117831a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k00) && this.f117831a == ((k00) obj).f117831a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117831a);
    }
}
