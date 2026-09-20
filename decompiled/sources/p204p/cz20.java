package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cz20 implements dz20 {

    /* JADX INFO: renamed from: a */
    public final hnk f43425a;

    /* JADX INFO: renamed from: b */
    public final String f43426b;

    public cz20(hnk hnkVar) {
        this.f43425a = hnkVar;
        this.f43426b = hnkVar.f93351a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz20) && wj50.m88271j(this.f43425a, ((cz20) obj).f43425a);
    }

    @Override // p204p.dz20
    public final String getKey() {
        return this.f43426b;
    }

    public final int hashCode() {
        return this.f43425a.hashCode();
    }
}
