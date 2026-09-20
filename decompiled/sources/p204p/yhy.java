package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yhy {

    /* JADX INFO: renamed from: a */
    public final String f272989a;

    /* JADX INFO: renamed from: b */
    public final thy f272990b;

    /* JADX INFO: renamed from: c */
    public final gh00 f272991c;

    public yhy(String str, thy thyVar, gh00 gh00Var) {
        this.f272989a = str;
        this.f272990b = thyVar;
        this.f272991c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhy)) {
            return false;
        }
        yhy yhyVar = (yhy) obj;
        return wj50.m88271j(this.f272989a, yhyVar.f272989a) && wj50.m88271j(this.f272990b, yhyVar.f272990b) && wj50.m88271j(this.f272991c, yhyVar.f272991c);
    }

    public final int hashCode() {
        return this.f272991c.hashCode() + ((this.f272990b.hashCode() + (this.f272989a.hashCode() * 31)) * 31);
    }
}
