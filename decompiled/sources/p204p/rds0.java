package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rds0 {

    /* JADX INFO: renamed from: a */
    public final boolean f198202a;

    public rds0(boolean z) {
        this.f198202a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rds0) && this.f198202a == ((rds0) obj).f198202a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198202a);
    }
}
