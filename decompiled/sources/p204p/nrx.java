package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nrx implements prx {

    /* JADX INFO: renamed from: a */
    public final String f157623a;

    public nrx(String str) {
        this.f157623a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrx) && wj50.m88271j(this.f157623a, ((nrx) obj).f157623a);
    }

    @Override // p204p.prx
    public final String getUri() {
        return this.f157623a;
    }

    public final int hashCode() {
        return this.f157623a.hashCode();
    }
}
