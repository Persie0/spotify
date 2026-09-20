package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dec {

    /* JADX INFO: renamed from: a */
    public final cec f48051a;

    public dec(cec cecVar) {
        this.f48051a = cecVar;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 3;
        if (this == obj) {
            return true;
        }
        return (obj instanceof dec) && this.f48051a.equals(((dec) obj).f48051a) && obj2.equals(obj2);
    }

    public final int hashCode() {
        Integer num = 3;
        return edb.m38547C(2) + f710.m40938f(1, (num.hashCode() + (this.f48051a.hashCode() * 31)) * 31, 31);
    }
}
