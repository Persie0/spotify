package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tbt0 extends mkg1 {

    /* JADX INFO: renamed from: c */
    public final boolean f218949c;

    public tbt0(boolean z) {
        this.f218949c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbt0) && this.f218949c == ((tbt0) obj).f218949c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218949c);
    }
}
