package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sj31 {

    /* JADX INFO: renamed from: a */
    public final Long f209754a;

    public sj31(Long l) {
        this.f209754a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj31) && this.f209754a.equals(((sj31) obj).f209754a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f209754a.hashCode() * 31);
    }
}
