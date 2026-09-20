package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a7c implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f13018a;

    public a7c(int i) {
        this.f13018a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7c) && this.f13018a == ((a7c) obj).f13018a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13018a);
    }
}
