package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uf3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final int f229665a;

    public uf3(int i) {
        this.f229665a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf3) && this.f229665a == ((uf3) obj).f229665a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229665a);
    }
}
