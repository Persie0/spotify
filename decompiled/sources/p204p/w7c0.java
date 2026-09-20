package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248635a;

    public w7c0(boolean z) {
        this.f248635a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7c0) && this.f248635a == ((w7c0) obj).f248635a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248635a);
    }
}
