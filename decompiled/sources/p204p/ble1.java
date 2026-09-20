package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ble1 {

    /* JADX INFO: renamed from: a */
    public final int f28175a;

    public ble1(int i) {
        this.f28175a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ble1) && this.f28175a == ((ble1) obj).f28175a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28175a);
    }
}
