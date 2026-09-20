package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ayd1 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final int f21215a;

    public ayd1(int i) {
        this.f21215a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayd1) && this.f21215a == ((ayd1) obj).f21215a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21215a);
    }
}
