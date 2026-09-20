package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jnm0 implements knm0 {

    /* JADX INFO: renamed from: a */
    public final int f114174a;

    public jnm0(int i) {
        this.f114174a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnm0) && this.f114174a == ((jnm0) obj).f114174a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f114174a);
    }
}
