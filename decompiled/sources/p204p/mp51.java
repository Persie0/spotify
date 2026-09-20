package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mp51 implements pp51 {

    /* JADX INFO: renamed from: a */
    public final boolean f145900a;

    public mp51(boolean z) {
        this.f145900a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp51) && this.f145900a == ((mp51) obj).f145900a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145900a) * 31;
    }
}
