package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hpq0 implements lpq0 {

    /* JADX INFO: renamed from: a */
    public final int f93828a;

    public hpq0(int i) {
        this.f93828a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpq0) && this.f93828a == ((hpq0) obj).f93828a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f93828a);
    }
}
