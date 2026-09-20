package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sdc {

    /* JADX INFO: renamed from: a */
    public final String f207975a;

    /* JADX INFO: renamed from: b */
    public final String f207976b;

    public sdc(String str, String str2) {
        this.f207975a = str;
        this.f207976b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdc)) {
            return false;
        }
        sdc sdcVar = (sdc) obj;
        return wj50.m88271j(this.f207975a, sdcVar.f207975a) && wj50.m88271j(this.f207976b, sdcVar.f207976b);
    }

    public final int hashCode() {
        return this.f207976b.hashCode() + (this.f207975a.hashCode() * 31);
    }
}
