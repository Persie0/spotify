package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class znq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final int f284548a;

    public znq0(int i) {
        this.f284548a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znq0) && this.f284548a == ((znq0) obj).f284548a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f284548a);
    }
}
