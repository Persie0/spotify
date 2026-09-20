package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hh20 implements jh20 {

    /* JADX INFO: renamed from: a */
    public final int f91263a;

    public hh20(int i) {
        this.f91263a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh20) && this.f91263a == ((hh20) obj).f91263a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91263a);
    }
}
