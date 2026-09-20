package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pjb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f178219a;

    /* JADX INFO: renamed from: b */
    public final sjb f178220b;

    public pjb(String str, sjb sjbVar) {
        this.f178219a = str;
        this.f178220b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f178219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjb)) {
            return false;
        }
        pjb pjbVar = (pjb) obj;
        return wj50.m88271j(this.f178219a, pjbVar.f178219a) && this.f178220b == pjbVar.f178220b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f178220b;
    }

    public final int hashCode() {
        return this.f178220b.hashCode() + (this.f178219a.hashCode() * 31);
    }
}
