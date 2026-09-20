package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kki implements sli {

    /* JADX INFO: renamed from: a */
    public final ms51 f123607a;

    public kki(ms51 ms51Var) {
        this.f123607a = ms51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kki) && wj50.m88271j(this.f123607a, ((kki) obj).f123607a);
    }

    public final int hashCode() {
        return this.f123607a.hashCode();
    }
}
