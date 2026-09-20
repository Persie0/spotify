package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ojb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f166027a;

    /* JADX INFO: renamed from: b */
    public final sjb f166028b;

    public ojb(String str, sjb sjbVar) {
        this.f166027a = str;
        this.f166028b = sjbVar;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f166027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojb)) {
            return false;
        }
        ojb ojbVar = (ojb) obj;
        return wj50.m88271j(this.f166027a, ojbVar.f166027a) && this.f166028b == ojbVar.f166028b;
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return this.f166028b;
    }

    public final int hashCode() {
        return this.f166028b.hashCode() + (this.f166027a.hashCode() * 31);
    }
}
