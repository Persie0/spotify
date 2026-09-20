package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kcc0 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f121427c;

    public kcc0(boolean z) {
        this.f121427c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcc0) && this.f121427c == ((kcc0) obj).f121427c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121427c);
    }
}
