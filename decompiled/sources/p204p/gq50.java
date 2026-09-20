package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gq50 implements vq50 {

    /* JADX INFO: renamed from: a */
    public final String f83351a;

    /* JADX INFO: renamed from: b */
    public final String f83352b;

    /* JADX INFO: renamed from: c */
    public final String f83353c;

    /* JADX INFO: renamed from: d */
    public final String f83354d;

    /* JADX INFO: renamed from: e */
    public final ok11 f83355e;

    public gq50(String str, String str2, String str3, String str4, ok11 ok11Var) {
        this.f83351a = str;
        this.f83352b = str2;
        this.f83353c = str3;
        this.f83354d = str4;
        this.f83355e = ok11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq50)) {
            return false;
        }
        gq50 gq50Var = (gq50) obj;
        return wj50.m88271j(this.f83351a, gq50Var.f83351a) && wj50.m88271j(this.f83352b, gq50Var.f83352b) && wj50.m88271j(this.f83353c, gq50Var.f83353c) && wj50.m88271j(this.f83354d, gq50Var.f83354d) && wj50.m88271j(this.f83355e, gq50Var.f83355e);
    }

    @Override // p204p.vq50
    public final String getTitle() {
        return this.f83353c;
    }

    public final int hashCode() {
        return this.f83355e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f83351a.hashCode() * 31, 31, this.f83352b), 31, this.f83353c), 31, this.f83354d);
    }

    @Override // p204p.vq50
    /* JADX INFO: renamed from: o */
    public final String mo45408o() {
        return this.f83354d;
    }
}
