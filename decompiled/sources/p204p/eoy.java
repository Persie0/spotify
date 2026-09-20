package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eoy implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f61485a;

    /* JADX INFO: renamed from: b */
    public final String f61486b;

    public eoy(String str, String str2) {
        this.f61485a = str;
        this.f61486b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoy)) {
            return false;
        }
        eoy eoyVar = (eoy) obj;
        return wj50.m88271j(this.f61485a, eoyVar.f61485a) && wj50.m88271j(this.f61486b, eoyVar.f61486b);
    }

    public final int hashCode() {
        return this.f61486b.hashCode() + (this.f61485a.hashCode() * 31);
    }
}
