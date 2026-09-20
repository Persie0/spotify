package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class njb implements ujb {

    /* JADX INFO: renamed from: a */
    public final String f154537a;

    /* JADX INFO: renamed from: b */
    public final String f154538b;

    public njb(String str, String str2) {
        this.f154537a = str;
        this.f154538b = str2;
    }

    @Override // p204p.ujb
    /* JADX INFO: renamed from: a */
    public final String mo59144a() {
        return this.f154537a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njb)) {
            return false;
        }
        njb njbVar = (njb) obj;
        return wj50.m88271j(this.f154537a, njbVar.f154537a) && wj50.m88271j(this.f154538b, njbVar.f154538b);
    }

    @Override // p204p.ujb
    public final sjb getStatus() {
        return sjb.f209797b;
    }

    public final int hashCode() {
        return this.f154538b.hashCode() + ((sjb.f209797b.hashCode() + (this.f154537a.hashCode() * 31)) * 31);
    }
}
