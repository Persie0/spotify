package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uo10 implements vo10 {

    /* JADX INFO: renamed from: a */
    public final int f232307a;

    public uo10(int i) {
        this.f232307a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo10) && this.f232307a == ((uo10) obj).f232307a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232307a);
    }
}
