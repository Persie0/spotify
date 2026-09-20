package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a060 implements c060 {

    /* JADX INFO: renamed from: a */
    public final int f10999a;

    public a060(int i) {
        this.f10999a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a060) && this.f10999a == ((a060) obj).f10999a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f10999a);
    }
}
