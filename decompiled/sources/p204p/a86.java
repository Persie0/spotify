package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a86 implements d86 {

    /* JADX INFO: renamed from: a */
    public final int f13197a;

    public a86(int i) {
        this.f13197a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a86) && this.f13197a == ((a86) obj).f13197a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13197a);
    }
}
