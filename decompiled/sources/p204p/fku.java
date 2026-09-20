package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fku {

    /* JADX INFO: renamed from: a */
    public final String f70622a;

    /* JADX INFO: renamed from: b */
    public final peu f70623b;

    public fku(String str, peu peuVar) {
        this.f70622a = str;
        this.f70623b = peuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fku)) {
            return false;
        }
        fku fkuVar = (fku) obj;
        return wj50.m88271j(this.f70622a, fkuVar.f70622a) && wj50.m88271j(this.f70623b, fkuVar.f70623b);
    }

    public final int hashCode() {
        return this.f70623b.hashCode() + (this.f70622a.hashCode() * 31);
    }
}
