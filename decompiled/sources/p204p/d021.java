package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d021 extends f021 {

    /* JADX INFO: renamed from: a */
    public final int f43712a;

    public d021(int i) {
        this.f43712a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d021) && this.f43712a == ((d021) obj).f43712a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43712a);
    }
}
