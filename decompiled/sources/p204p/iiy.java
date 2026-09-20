package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iiy implements miy {

    /* JADX INFO: renamed from: a */
    public final String f102648a;

    /* JADX INFO: renamed from: b */
    public final ygy f102649b;

    public iiy(String str, ygy ygyVar) {
        this.f102648a = str;
        this.f102649b = ygyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiy)) {
            return false;
        }
        iiy iiyVar = (iiy) obj;
        return wj50.m88271j(this.f102648a, iiyVar.f102648a) && wj50.m88271j(this.f102649b, iiyVar.f102649b);
    }

    public final int hashCode() {
        return this.f102649b.hashCode() + (this.f102648a.hashCode() * 31);
    }
}
