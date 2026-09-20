package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sgi {

    /* JADX INFO: renamed from: a */
    public final String f208880a;

    /* JADX INFO: renamed from: b */
    public final sfi f208881b;

    public sgi(String str, sfi sfiVar) {
        this.f208880a = str;
        this.f208881b = sfiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgi)) {
            return false;
        }
        sgi sgiVar = (sgi) obj;
        return wj50.m88271j(this.f208880a, sgiVar.f208880a) && wj50.m88271j(this.f208881b, sgiVar.f208881b);
    }

    public final int hashCode() {
        return this.f208881b.hashCode() + (this.f208880a.hashCode() * 31);
    }
}
