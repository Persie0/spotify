package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wq11 extends yq11 {

    /* JADX INFO: renamed from: a */
    public final int f253889a;

    public wq11(int i) {
        this.f253889a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq11) && this.f253889a == ((wq11) obj).f253889a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f253889a);
    }
}
