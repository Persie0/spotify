package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dn2 {

    /* JADX INFO: renamed from: a */
    public final boolean f50659a;

    public dn2(boolean z) {
        this.f50659a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn2) && this.f50659a == ((dn2) obj).f50659a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50659a) + (edb.m38547C(2) * 31);
    }
}
