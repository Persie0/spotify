package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g220 {

    /* JADX INFO: renamed from: a */
    public final int f75820a;

    public g220(int i) {
        this.f75820a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g220) && this.f75820a == ((g220) obj).f75820a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75820a);
    }
}
