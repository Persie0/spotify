package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class enr extends pnr {

    /* JADX INFO: renamed from: a */
    public final int f61220a;

    public enr(int i) {
        this.f61220a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enr) && this.f61220a == ((enr) obj).f61220a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61220a);
    }
}
