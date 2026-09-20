package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class efc extends jfc {

    /* JADX INFO: renamed from: a */
    public final int f59017a;

    /* JADX INFO: renamed from: b */
    public final kmc f59018b;

    /* JADX INFO: renamed from: c */
    public final boolean f59019c;

    public efc(int i, kmc kmcVar, boolean z) {
        this.f59017a = i;
        this.f59018b = kmcVar;
        this.f59019c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efc)) {
            return false;
        }
        efc efcVar = (efc) obj;
        return this.f59017a == efcVar.f59017a && this.f59018b == efcVar.f59018b && this.f59019c == efcVar.f59019c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59019c) + ((this.f59018b.hashCode() + (Integer.hashCode(this.f59017a) * 31)) * 31);
    }
}
