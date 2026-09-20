package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a1w {

    /* JADX INFO: renamed from: a */
    public final String f11482a;

    /* JADX INFO: renamed from: b */
    public final String f11483b;

    /* JADX INFO: renamed from: c */
    public final h66 f11484c;

    public a1w(String str, String str2, h66 h66Var) {
        this.f11482a = str;
        this.f11483b = str2;
        this.f11484c = h66Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1w)) {
            return false;
        }
        a1w a1wVar = (a1w) obj;
        return wj50.m88271j(this.f11482a, a1wVar.f11482a) && wj50.m88271j(this.f11483b, a1wVar.f11483b) && wj50.m88271j(this.f11484c, a1wVar.f11484c);
    }

    public final int hashCode() {
        return this.f11484c.hashCode() + s571.m77243b(this.f11482a.hashCode() * 31, 31, this.f11483b);
    }
}
