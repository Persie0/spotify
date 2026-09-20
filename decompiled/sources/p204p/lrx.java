package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lrx implements prx {

    /* JADX INFO: renamed from: a */
    public final String f136367a;

    public lrx(String str) {
        this.f136367a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrx) && wj50.m88271j(this.f136367a, ((lrx) obj).f136367a);
    }

    @Override // p204p.prx
    public final String getUri() {
        return this.f136367a;
    }

    public final int hashCode() {
        return this.f136367a.hashCode();
    }
}
