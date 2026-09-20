package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bev {

    /* JADX INFO: renamed from: a */
    public final String f26453a;

    /* JADX INFO: renamed from: b */
    public final iev f26454b;

    /* JADX INFO: renamed from: c */
    public final jev f26455c;

    /* JADX INFO: renamed from: d */
    public final g5s0 f26456d;

    /* JADX INFO: renamed from: e */
    public final boolean f26457e;

    public bev(String str, iev ievVar, jev jevVar, g5s0 g5s0Var, boolean z) {
        this.f26453a = str;
        this.f26454b = ievVar;
        this.f26455c = jevVar;
        this.f26456d = g5s0Var;
        this.f26457e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bev)) {
            return false;
        }
        bev bevVar = (bev) obj;
        return wj50.m88271j(this.f26453a, bevVar.f26453a) && wj50.m88271j(this.f26454b, bevVar.f26454b) && this.f26455c == bevVar.f26455c && wj50.m88271j(this.f26456d, bevVar.f26456d) && this.f26457e == bevVar.f26457e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26457e) + ((this.f26456d.hashCode() + ((this.f26455c.hashCode() + ((this.f26454b.hashCode() + (this.f26453a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
