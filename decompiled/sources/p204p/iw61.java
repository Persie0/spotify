package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iw61 implements mw61 {

    /* JADX INFO: renamed from: a */
    public final String f106346a;

    /* JADX INFO: renamed from: b */
    public final rly f106347b;

    public iw61(String str, rly rlyVar) {
        this.f106346a = str;
        this.f106347b = rlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw61)) {
            return false;
        }
        iw61 iw61Var = (iw61) obj;
        return wj50.m88271j(this.f106346a, iw61Var.f106346a) && wj50.m88271j(this.f106347b, iw61Var.f106347b);
    }

    public final int hashCode() {
        return this.f106347b.hashCode() + (this.f106346a.hashCode() * 31);
    }
}
