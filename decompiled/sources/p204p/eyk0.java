package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eyk0 {

    /* JADX INFO: renamed from: a */
    public final int f64116a;

    public eyk0(int i) {
        this.f64116a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyk0) && this.f64116a == ((eyk0) obj).f64116a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f64116a);
    }
}
