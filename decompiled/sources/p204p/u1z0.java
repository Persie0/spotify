package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u1z0 extends v1z0 {

    /* JADX INFO: renamed from: a */
    public final int f225939a;

    public u1z0(int i) {
        this.f225939a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1z0) && this.f225939a == ((u1z0) obj).f225939a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f225939a);
    }
}
