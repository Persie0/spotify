package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class eor extends uor {

    /* JADX INFO: renamed from: a */
    public final int f61463a;

    public eor(int i) {
        this.f61463a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eor) && this.f61463a == ((eor) obj).f61463a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61463a);
    }
}
