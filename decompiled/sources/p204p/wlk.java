package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wlk implements zlk {

    /* JADX INFO: renamed from: a */
    public final String f252569a;

    /* JADX INFO: renamed from: b */
    public final qf40 f252570b;

    public wlk(String str, qf40 qf40Var) {
        this.f252569a = str;
        this.f252570b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlk)) {
            return false;
        }
        wlk wlkVar = (wlk) obj;
        return wj50.m88271j(this.f252569a, wlkVar.f252569a) && wj50.m88271j(this.f252570b, wlkVar.f252570b);
    }

    public final int hashCode() {
        return this.f252570b.hashCode() + (this.f252569a.hashCode() * 31);
    }
}
