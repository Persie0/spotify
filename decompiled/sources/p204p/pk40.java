package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pk40 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f178376a;

    /* JADX INFO: renamed from: b */
    public final String f178377b;

    /* JADX INFO: renamed from: c */
    public final String f178378c;

    /* JADX INFO: renamed from: d */
    public final vta f178379d;

    /* JADX INFO: renamed from: e */
    public final wwu f178380e;

    /* JADX INFO: renamed from: f */
    public final vsa f178381f;

    public pk40(String str, String str2, String str3, vta vtaVar, wwu wwuVar, vsa vsaVar) {
        this.f178376a = str;
        this.f178377b = str2;
        this.f178378c = str3;
        this.f178379d = vtaVar;
        this.f178380e = wwuVar;
        this.f178381f = vsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk40)) {
            return false;
        }
        pk40 pk40Var = (pk40) obj;
        return wj50.m88271j(this.f178376a, pk40Var.f178376a) && wj50.m88271j(this.f178377b, pk40Var.f178377b) && wj50.m88271j(this.f178378c, pk40Var.f178378c) && this.f178379d == pk40Var.f178379d && wj50.m88271j(this.f178380e, pk40Var.f178380e) && this.f178381f == pk40Var.f178381f;
    }

    public final int hashCode() {
        int iHashCode = (this.f178379d.hashCode() + s571.m77243b(s571.m77243b(this.f178376a.hashCode() * 31, 31, this.f178377b), 31, this.f178378c)) * 31;
        wwu wwuVar = this.f178380e;
        return this.f178381f.hashCode() + ((iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }
}
