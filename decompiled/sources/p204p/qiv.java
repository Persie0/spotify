package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qiv extends uiv {

    /* JADX INFO: renamed from: a */
    public final int f189079a;

    public qiv(int i) {
        this.f189079a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qiv) && this.f189079a == ((qiv) obj).f189079a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f189079a);
    }
}
