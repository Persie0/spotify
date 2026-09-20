package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ljb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f134029a;

    /* JADX INFO: renamed from: b */
    public final sjb f134030b;

    public ljb(String str, sjb sjbVar) {
        this.f134029a = str;
        this.f134030b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f134029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljb)) {
            return false;
        }
        ljb ljbVar = (ljb) obj;
        return wj50.m88271j(this.f134029a, ljbVar.f134029a) && this.f134030b == ljbVar.f134030b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f134030b;
    }

    public final int hashCode() {
        return this.f134030b.hashCode() + (this.f134029a.hashCode() * 31);
    }
}
