package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jrv implements lrv {

    /* JADX INFO: renamed from: a */
    public final String f115314a;

    /* JADX INFO: renamed from: b */
    public final String f115315b;

    public jrv(String str, String str2) {
        this.f115314a = str;
        this.f115315b = str2;
    }

    @Override // p204p.lrv
    /* JADX INFO: renamed from: a */
    public final String mo54194a() {
        return this.f115315b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrv)) {
            return false;
        }
        jrv jrvVar = (jrv) obj;
        return wj50.m88271j(this.f115314a, jrvVar.f115314a) && wj50.m88271j(this.f115315b, jrvVar.f115315b);
    }

    @Override // p204p.lrv
    public final String getEntityUri() {
        return this.f115314a;
    }

    public final int hashCode() {
        return this.f115315b.hashCode() + (this.f115314a.hashCode() * 31);
    }
}
