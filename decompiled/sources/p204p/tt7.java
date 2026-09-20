package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tt7 extends wt7 {

    /* JADX INFO: renamed from: a */
    public final boolean f223547a;

    public tt7(boolean z) {
        this.f223547a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt7) && this.f223547a == ((tt7) obj).f223547a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223547a);
    }
}
