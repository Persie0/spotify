package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rjb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f199786a;

    /* JADX INFO: renamed from: b */
    public final sjb f199787b;

    /* JADX INFO: renamed from: c */
    public final String f199788c;

    public rjb(String str, sjb sjbVar, String str2) {
        this.f199786a = str;
        this.f199787b = sjbVar;
        this.f199788c = str2;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f199786a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjb)) {
            return false;
        }
        rjb rjbVar = (rjb) obj;
        return wj50.m88271j(this.f199786a, rjbVar.f199786a) && this.f199787b == rjbVar.f199787b && wj50.m88271j(this.f199788c, rjbVar.f199788c);
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f199787b;
    }

    public final int hashCode() {
        return this.f199788c.hashCode() + ((this.f199787b.hashCode() + (this.f199786a.hashCode() * 31)) * 31);
    }
}
