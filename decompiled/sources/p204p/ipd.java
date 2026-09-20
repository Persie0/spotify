package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ipd implements jpd {

    /* JADX INFO: renamed from: a */
    public final int f104473a;

    public ipd(int i) {
        this.f104473a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipd) && this.f104473a == ((ipd) obj).f104473a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f104473a);
    }
}
