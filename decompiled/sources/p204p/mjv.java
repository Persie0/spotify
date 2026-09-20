package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mjv {

    /* JADX INFO: renamed from: a */
    public final int f144344a;

    public mjv(int i) {
        this.f144344a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjv) && this.f144344a == ((mjv) obj).f144344a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f144344a) * 961);
    }
}
