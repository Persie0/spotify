package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class krv implements lrv {

    /* JADX INFO: renamed from: a */
    public final String f125730a;

    /* JADX INFO: renamed from: b */
    public final String f125731b;

    public krv(String str, String str2) {
        this.f125730a = str;
        this.f125731b = str2;
    }

    @Override // p204p.lrv
    /* JADX INFO: renamed from: a */
    public final String mo54194a() {
        return this.f125731b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krv)) {
            return false;
        }
        krv krvVar = (krv) obj;
        return wj50.m88271j(this.f125730a, krvVar.f125730a) && wj50.m88271j(this.f125731b, krvVar.f125731b);
    }

    @Override // p204p.lrv
    public final String getEntityUri() {
        return this.f125730a;
    }

    public final int hashCode() {
        return this.f125731b.hashCode() + (this.f125730a.hashCode() * 31);
    }
}
