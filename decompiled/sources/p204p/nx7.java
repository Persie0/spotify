package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nx7 implements ox7 {

    /* JADX INFO: renamed from: a */
    public final int f159382a;

    public nx7(int i) {
        this.f159382a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx7) && this.f159382a == ((nx7) obj).f159382a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f159382a);
    }
}
