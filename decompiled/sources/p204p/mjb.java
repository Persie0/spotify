package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mjb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f144218a;

    /* JADX INFO: renamed from: b */
    public final sjb f144219b;

    public mjb(String str, sjb sjbVar) {
        this.f144218a = str;
        this.f144219b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f144218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjb)) {
            return false;
        }
        mjb mjbVar = (mjb) obj;
        return wj50.m88271j(this.f144218a, mjbVar.f144218a) && this.f144219b == mjbVar.f144219b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f144219b;
    }

    public final int hashCode() {
        return this.f144219b.hashCode() + (this.f144218a.hashCode() * 31);
    }
}
