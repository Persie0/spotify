package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ih20 implements jh20 {

    /* JADX INFO: renamed from: a */
    public final int f102128a;

    public ih20(int i) {
        this.f102128a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih20) && this.f102128a == ((ih20) obj).f102128a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f102128a);
    }
}
