package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jsm0 {

    /* JADX INFO: renamed from: a */
    public final String f115517a;

    /* JADX INFO: renamed from: b */
    public final ew31 f115518b;

    public jsm0(String str, ew31 ew31Var) {
        this.f115517a = str;
        this.f115518b = ew31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsm0)) {
            return false;
        }
        jsm0 jsm0Var = (jsm0) obj;
        return wj50.m88271j(this.f115517a, jsm0Var.f115517a) && wj50.m88271j(this.f115518b, jsm0Var.f115518b);
    }

    public final int hashCode() {
        return this.f115518b.hashCode() + (this.f115517a.hashCode() * 31);
    }
}
