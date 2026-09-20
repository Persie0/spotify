package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final int f123712a;

    public kku0(int i) {
        this.f123712a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kku0) && this.f123712a == ((kku0) obj).f123712a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123712a);
    }
}
