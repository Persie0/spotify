package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cmu0 extends nlp {

    /* JADX INFO: renamed from: b */
    public final boolean f39795b;

    public cmu0(boolean z) {
        super(u6j0.f227366X);
        this.f39795b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmu0) && this.f39795b == ((cmu0) obj).f39795b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39795b);
    }
}
