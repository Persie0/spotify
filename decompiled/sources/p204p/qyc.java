package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qyc implements uyc {

    /* JADX INFO: renamed from: a */
    public final int f193868a;

    public qyc(int i) {
        this.f193868a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qyc) && this.f193868a == ((qyc) obj).f193868a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f193868a);
    }
}
