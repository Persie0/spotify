package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nkb0 implements okb0 {

    /* JADX INFO: renamed from: a */
    public final int f154846a;

    public nkb0(int i) {
        this.f154846a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nkb0) && this.f154846a == ((nkb0) obj).f154846a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154846a);
    }
}
