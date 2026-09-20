package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d2m {

    /* JADX INFO: renamed from: a */
    public final String f44583a;

    /* JADX INFO: renamed from: b */
    public final String f44584b;

    public d2m(String str, String str2) {
        this.f44583a = str;
        this.f44584b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2m)) {
            return false;
        }
        d2m d2mVar = (d2m) obj;
        return wj50.m88271j(this.f44583a, d2mVar.f44583a) && wj50.m88271j(this.f44584b, d2mVar.f44584b);
    }

    public final int hashCode() {
        return this.f44584b.hashCode() + (this.f44583a.hashCode() * 31);
    }
}
