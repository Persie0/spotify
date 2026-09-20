package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xgw {

    /* JADX INFO: renamed from: a */
    public final String f261381a;

    /* JADX INFO: renamed from: b */
    public final String f261382b;

    /* JADX INFO: renamed from: c */
    public final String f261383c;

    public xgw(String str, String str2, String str3) {
        this.f261381a = str;
        this.f261382b = str2;
        this.f261383c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgw)) {
            return false;
        }
        xgw xgwVar = (xgw) obj;
        return wj50.m88271j(this.f261381a, xgwVar.f261381a) && wj50.m88271j(this.f261382b, xgwVar.f261382b) && wj50.m88271j(this.f261383c, xgwVar.f261383c);
    }

    public final int hashCode() {
        return this.f261383c.hashCode() + s571.m77243b(this.f261381a.hashCode() * 31, 31, this.f261382b);
    }
}
