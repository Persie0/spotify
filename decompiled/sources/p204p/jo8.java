package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jo8 extends ko8 {

    /* JADX INFO: renamed from: a */
    public final int f114353a;

    public jo8(int i) {
        this.f114353a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo8) && this.f114353a == ((jo8) obj).f114353a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114353a);
    }
}
