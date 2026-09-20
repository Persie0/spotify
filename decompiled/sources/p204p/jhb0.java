package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jhb0 implements mhb0 {

    /* JADX INFO: renamed from: a */
    public final s7f f112378a;

    public jhb0(s7f s7fVar) {
        this.f112378a = s7fVar;
    }

    @Override // p204p.mhb0
    /* JADX INFO: renamed from: a */
    public final s7f mo53373a() {
        return this.f112378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhb0) && wj50.m88271j(this.f112378a, ((jhb0) obj).f112378a);
    }

    public final int hashCode() {
        return this.f112378a.hashCode();
    }
}
