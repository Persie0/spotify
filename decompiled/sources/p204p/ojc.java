package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ojc {

    /* JADX INFO: renamed from: a */
    public final kva1 f166032a;

    /* JADX INFO: renamed from: b */
    public final String f166033b;

    /* JADX INFO: renamed from: c */
    public final int f166034c;

    /* JADX INFO: renamed from: d */
    public final qjc f166035d;

    public ojc(kva1 kva1Var, String str, int i, qjc qjcVar) {
        this.f166032a = kva1Var;
        this.f166033b = str;
        this.f166034c = i;
        this.f166035d = qjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojc)) {
            return false;
        }
        ojc ojcVar = (ojc) obj;
        return this.f166032a.equals(ojcVar.f166032a) && this.f166033b.equals(ojcVar.f166033b) && this.f166034c == ojcVar.f166034c && this.f166035d.equals(ojcVar.f166035d);
    }

    public final int hashCode() {
        return this.f166035d.f189212a.hashCode() + f710.m40938f(this.f166034c, s571.m77243b(this.f166032a.hashCode() * 31, 31, this.f166033b), 31);
    }
}
