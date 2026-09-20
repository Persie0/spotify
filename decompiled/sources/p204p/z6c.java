package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z6c {

    /* JADX INFO: renamed from: a */
    public final String f279822a;

    /* JADX INFO: renamed from: b */
    public final String f279823b;

    /* JADX INFO: renamed from: c */
    public final String f279824c;

    /* JADX INFO: renamed from: d */
    public final rp0 f279825d;

    /* JADX INFO: renamed from: e */
    public final pdr0 f279826e;

    public z6c(String str, String str2, String str3, rp0 rp0Var, pdr0 pdr0Var) {
        this.f279822a = str;
        this.f279823b = str2;
        this.f279824c = str3;
        this.f279825d = rp0Var;
        this.f279826e = pdr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c)) {
            return false;
        }
        z6c z6cVar = (z6c) obj;
        return wj50.m88271j(this.f279822a, z6cVar.f279822a) && wj50.m88271j(this.f279823b, z6cVar.f279823b) && wj50.m88271j(this.f279824c, z6cVar.f279824c) && wj50.m88271j(this.f279825d, z6cVar.f279825d) && wj50.m88271j(this.f279826e, z6cVar.f279826e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f279822a.hashCode() * 31, 31, this.f279823b), 31, this.f279824c);
        rp0 rp0Var = this.f279825d;
        int iHashCode = (iM77243b + (rp0Var == null ? 0 : rp0Var.hashCode())) * 31;
        pdr0 pdr0Var = this.f279826e;
        return iHashCode + (pdr0Var != null ? pdr0Var.hashCode() : 0);
    }
}
