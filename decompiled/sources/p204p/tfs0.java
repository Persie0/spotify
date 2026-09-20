package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tfs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220044a;

    public tfs0(boolean z) {
        this.f220044a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfs0) && this.f220044a == ((tfs0) obj).f220044a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220044a);
    }
}
