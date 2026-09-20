package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aht {

    /* JADX INFO: renamed from: a */
    public final boolean f15764a;

    public aht(boolean z) {
        this.f15764a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aht) && this.f15764a == ((aht) obj).f15764a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15764a);
    }
}
