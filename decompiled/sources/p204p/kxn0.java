package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kxn0 implements lxn0 {

    /* JADX INFO: renamed from: a */
    public final int f127526a;

    public kxn0(int i) {
        this.f127526a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxn0) && this.f127526a == ((kxn0) obj).f127526a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127526a);
    }
}
