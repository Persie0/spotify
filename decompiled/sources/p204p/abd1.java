package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class abd1 {

    /* JADX INFO: renamed from: a */
    public final int f14095a;

    public abd1(int i) {
        this.f14095a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abd1) && this.f14095a == ((abd1) obj).f14095a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14095a);
    }
}
