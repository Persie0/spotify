package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z0w0 {

    /* JADX INFO: renamed from: a */
    public final Long f278179a;

    public z0w0(Long l) {
        this.f278179a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0w0) && this.f278179a.equals(((z0w0) obj).f278179a);
    }

    public final int hashCode() {
        return this.f278179a.hashCode() * 31;
    }
}
