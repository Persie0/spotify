package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sak implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f207224a;

    /* JADX INFO: renamed from: b */
    public final String f207225b;

    /* JADX INFO: renamed from: c */
    public final String f207226c;

    public sak(String str, String str2, String str3) {
        this.f207224a = str;
        this.f207225b = str2;
        this.f207226c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sak)) {
            return false;
        }
        sak sakVar = (sak) obj;
        return wj50.m88271j(this.f207224a, sakVar.f207224a) && wj50.m88271j(this.f207225b, sakVar.f207225b) && wj50.m88271j(this.f207226c, sakVar.f207226c);
    }

    public final int hashCode() {
        return this.f207226c.hashCode() + s571.m77243b(this.f207224a.hashCode() * 31, 31, this.f207225b);
    }
}
