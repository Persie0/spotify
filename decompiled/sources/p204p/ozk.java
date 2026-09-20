package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ozk {

    /* JADX INFO: renamed from: a */
    public String f172308a;

    /* JADX INFO: renamed from: b */
    public String f172309b;

    /* JADX INFO: renamed from: c */
    public String f172310c;

    /* JADX INFO: renamed from: d */
    public String f172311d;

    /* JADX INFO: renamed from: a */
    public final vzk m68646a() {
        return new vzk(this.f172308a, this.f172309b, this.f172310c, this.f172311d);
    }

    /* JADX INFO: renamed from: b */
    public final void m68647b(String str) {
        this.f172310c = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m68648c(String str) {
        this.f172309b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m68649d(String str) {
        this.f172308a = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m68650e(String str) {
        this.f172311d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozk)) {
            return false;
        }
        ozk ozkVar = (ozk) obj;
        return wj50.m88271j(this.f172308a, ozkVar.f172308a) && wj50.m88271j(this.f172309b, ozkVar.f172309b) && wj50.m88271j(this.f172310c, ozkVar.f172310c) && wj50.m88271j(this.f172311d, ozkVar.f172311d);
    }

    public final int hashCode() {
        int iHashCode = this.f172308a.hashCode() * 31;
        String str = this.f172309b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172310c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f172311d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
