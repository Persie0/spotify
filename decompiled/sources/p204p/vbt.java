package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vbt {

    /* JADX INFO: renamed from: a */
    public final String f239576a;

    /* JADX INFO: renamed from: b */
    public final String f239577b;

    public vbt(String str, String str2) {
        this.f239576a = str;
        this.f239577b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbt)) {
            return false;
        }
        vbt vbtVar = (vbt) obj;
        return wj50.m88271j(this.f239576a, vbtVar.f239576a) && wj50.m88271j(this.f239577b, vbtVar.f239577b);
    }

    public final int hashCode() {
        return this.f239577b.hashCode() + (this.f239576a.hashCode() * 31);
    }
}
