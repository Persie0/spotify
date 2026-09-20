package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m730 {

    /* JADX INFO: renamed from: a */
    public final int f140635a;

    public m730(int i) {
        this.f140635a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m730) && this.f140635a == ((m730) obj).f140635a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f140635a) + (edb.m38547C(1) * 31);
    }
}
