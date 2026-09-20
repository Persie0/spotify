package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a5a {

    /* JADX INFO: renamed from: a */
    public final String f12466a;

    /* JADX INFO: renamed from: b */
    public final wa7 f12467b;

    public a5a(String str, wa7 wa7Var) {
        this.f12466a = str;
        this.f12467b = wa7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5a)) {
            return false;
        }
        a5a a5aVar = (a5a) obj;
        return wj50.m88271j(this.f12466a, a5aVar.f12466a) && wj50.m88271j(this.f12467b, a5aVar.f12467b);
    }

    public final int hashCode() {
        return this.f12467b.hashCode() + (this.f12466a.hashCode() * 31);
    }
}
