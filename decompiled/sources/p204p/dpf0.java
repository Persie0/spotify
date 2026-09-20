package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dpf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final int f51321a;

    public dpf0(int i) {
        this.f51321a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpf0) && this.f51321a == ((dpf0) obj).f51321a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51321a);
    }
}
