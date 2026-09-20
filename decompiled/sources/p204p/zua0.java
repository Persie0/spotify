package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zua0 implements fz0 {

    /* JADX INFO: renamed from: a */
    public final int f286397a;

    public zua0(int i) {
        this.f286397a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zua0) && this.f286397a == ((zua0) obj).f286397a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f286397a);
    }
}
