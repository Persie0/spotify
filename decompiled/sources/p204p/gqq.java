package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gqq {

    /* JADX INFO: renamed from: a */
    public final String f83513a;

    /* JADX INFO: renamed from: b */
    public final String f83514b;

    /* JADX INFO: renamed from: c */
    public final String f83515c;

    public /* synthetic */ gqq() {
        this("", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqq)) {
            return false;
        }
        gqq gqqVar = (gqq) obj;
        return wj50.m88271j(this.f83513a, gqqVar.f83513a) && wj50.m88271j(this.f83514b, gqqVar.f83514b) && wj50.m88271j(this.f83515c, gqqVar.f83515c);
    }

    public final int hashCode() {
        return this.f83515c.hashCode() + s571.m77243b(this.f83513a.hashCode() * 31, 31, this.f83514b);
    }

    public gqq(String str, String str2, String str3) {
        this.f83513a = str;
        this.f83514b = str2;
        this.f83515c = str3;
    }
}
