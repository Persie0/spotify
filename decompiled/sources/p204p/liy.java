package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class liy implements miy {

    /* JADX INFO: renamed from: a */
    public final String f133906a;

    /* JADX INFO: renamed from: b */
    public final ygy f133907b;

    public liy(String str, ygy ygyVar) {
        this.f133906a = str;
        this.f133907b = ygyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liy)) {
            return false;
        }
        liy liyVar = (liy) obj;
        return wj50.m88271j(this.f133906a, liyVar.f133906a) && wj50.m88271j(this.f133907b, liyVar.f133907b);
    }

    public final int hashCode() {
        return this.f133907b.hashCode() + (this.f133906a.hashCode() * 31);
    }
}
