package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f245497a;

    /* JADX INFO: renamed from: b */
    public final String f245498b;

    /* JADX INFO: renamed from: c */
    public final String f245499c;

    public vwh(String str, String str2, String str3) {
        this.f245497a = str;
        this.f245498b = str2;
        this.f245499c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwh)) {
            return false;
        }
        vwh vwhVar = (vwh) obj;
        return wj50.m88271j(this.f245497a, vwhVar.f245497a) && wj50.m88271j(this.f245498b, vwhVar.f245498b) && wj50.m88271j(this.f245499c, vwhVar.f245499c);
    }

    public final int hashCode() {
        int iHashCode = this.f245497a.hashCode() * 31;
        String str = this.f245498b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f245499c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
