package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pcc0 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f176040c;

    public pcc0(boolean z) {
        this.f176040c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcc0) && this.f176040c == ((pcc0) obj).f176040c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176040c);
    }
}
