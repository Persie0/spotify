package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a5m implements e5m {

    /* JADX INFO: renamed from: a */
    public final e5m f12560a;

    public a5m(e5m e5mVar) {
        this.f12560a = e5mVar;
    }

    @Override // p204p.e5m
    /* JADX INFO: renamed from: a */
    public final boolean mo24809a() {
        return this.f12560a.mo24809a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5m) && wj50.m88271j(this.f12560a, ((a5m) obj).f12560a);
    }

    public final int hashCode() {
        return this.f12560a.hashCode();
    }
}
