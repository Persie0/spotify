package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qjb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f189204a;

    /* JADX INFO: renamed from: b */
    public final sjb f189205b;

    public qjb(String str, sjb sjbVar) {
        this.f189204a = str;
        this.f189205b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f189204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjb)) {
            return false;
        }
        qjb qjbVar = (qjb) obj;
        return wj50.m88271j(this.f189204a, qjbVar.f189204a) && this.f189205b == qjbVar.f189205b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f189205b;
    }

    public final int hashCode() {
        return this.f189205b.hashCode() + (this.f189204a.hashCode() * 31);
    }
}
