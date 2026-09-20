package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tjb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f220866a;

    /* JADX INFO: renamed from: b */
    public final sjb f220867b;

    public tjb(String str, sjb sjbVar) {
        this.f220866a = str;
        this.f220867b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f220866a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjb)) {
            return false;
        }
        tjb tjbVar = (tjb) obj;
        return wj50.m88271j(this.f220866a, tjbVar.f220866a) && this.f220867b == tjbVar.f220867b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f220867b;
    }

    public final int hashCode() {
        return this.f220867b.hashCode() + (this.f220866a.hashCode() * 31);
    }
}
