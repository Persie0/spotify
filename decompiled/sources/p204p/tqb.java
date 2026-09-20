package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tqb {

    /* JADX INFO: renamed from: a */
    public final String f222781a;

    /* JADX INFO: renamed from: b */
    public final String f222782b;

    /* JADX INFO: renamed from: c */
    public final String f222783c;

    public tqb(String str, String str2, String str3) {
        this.f222781a = str;
        this.f222782b = str2;
        this.f222783c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqb)) {
            return false;
        }
        tqb tqbVar = (tqb) obj;
        return wj50.m88271j(this.f222781a, tqbVar.f222781a) && wj50.m88271j(this.f222782b, tqbVar.f222782b) && wj50.m88271j(this.f222783c, tqbVar.f222783c);
    }

    public final int hashCode() {
        return this.f222783c.hashCode() + s571.m77243b(this.f222781a.hashCode() * 31, 31, this.f222782b);
    }
}
