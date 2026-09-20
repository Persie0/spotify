package p204p;

/* JADX INFO: renamed from: p.ii */
/* JADX INFO: loaded from: classes.dex */
public final class C1979ii implements InterfaceC2165ni {

    /* JADX INFO: renamed from: a */
    public final AbstractC1861fi f102385a;

    /* JADX INFO: renamed from: b */
    public final String f102386b;

    public C1979ii(String str, AbstractC1861fi abstractC1861fi) {
        this.f102385a = abstractC1861fi;
        this.f102386b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1979ii)) {
            return false;
        }
        C1979ii c1979ii = (C1979ii) obj;
        return wj50.m88271j(this.f102385a, c1979ii.f102385a) && wj50.m88271j(this.f102386b, c1979ii.f102386b);
    }

    public final int hashCode() {
        return this.f102386b.hashCode() + (this.f102385a.hashCode() * 31);
    }
}
