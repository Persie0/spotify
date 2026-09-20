package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j6x {

    /* JADX INFO: renamed from: a */
    public final boolean f109418a;

    /* JADX INFO: renamed from: b */
    public final boolean f109419b;

    public j6x(boolean z, boolean z2) {
        this.f109418a = z;
        this.f109419b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6x)) {
            return false;
        }
        j6x j6xVar = (j6x) obj;
        return this.f109418a == j6xVar.f109418a && this.f109419b == j6xVar.f109419b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109419b) + (Boolean.hashCode(this.f109418a) * 31);
    }
}
