package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jrx implements prx {

    /* JADX INFO: renamed from: a */
    public final String f115334a;

    public jrx(String str) {
        this.f115334a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrx) && wj50.m88271j(this.f115334a, ((jrx) obj).f115334a);
    }

    @Override // p204p.prx
    public final String getUri() {
        return this.f115334a;
    }

    public final int hashCode() {
        return this.f115334a.hashCode();
    }
}
