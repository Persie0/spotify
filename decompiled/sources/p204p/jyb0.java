package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jyb0 {

    /* JADX INFO: renamed from: a */
    public final myb0 f117356a;

    /* JADX INFO: renamed from: b */
    public final ofm0 f117357b;

    /* JADX INFO: renamed from: c */
    public final r250 f117358c;

    public jyb0(myb0 myb0Var, ofm0 ofm0Var, r250 r250Var) {
        this.f117356a = myb0Var;
        this.f117357b = ofm0Var;
        this.f117358c = r250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyb0)) {
            return false;
        }
        jyb0 jyb0Var = (jyb0) obj;
        return wj50.m88271j(this.f117356a, jyb0Var.f117356a) && wj50.m88271j(this.f117357b, jyb0Var.f117357b) && wj50.m88271j(this.f117358c, jyb0Var.f117358c);
    }

    public final int hashCode() {
        return this.f117358c.f195052b.hashCode() + ((this.f117357b.hashCode() + (this.f117356a.hashCode() * 31)) * 31);
    }
}
