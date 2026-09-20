package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class amy implements hmy {

    /* JADX INFO: renamed from: a */
    public final koy f17229a;

    /* JADX INFO: renamed from: b */
    public final String f17230b;

    /* JADX INFO: renamed from: c */
    public final String f17231c;

    public amy(koy koyVar, String str, String str2) {
        this.f17229a = koyVar;
        this.f17230b = str;
        this.f17231c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amy)) {
            return false;
        }
        amy amyVar = (amy) obj;
        return wj50.m88271j(this.f17229a, amyVar.f17229a) && wj50.m88271j(this.f17230b, amyVar.f17230b) && wj50.m88271j(this.f17231c, amyVar.f17231c);
    }

    public final int hashCode() {
        return this.f17231c.hashCode() + s571.m77243b(this.f17229a.hashCode() * 31, 31, this.f17230b);
    }
}
