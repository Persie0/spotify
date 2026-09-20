package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hjb {

    /* JADX INFO: renamed from: a */
    public final String f92005a;

    /* JADX INFO: renamed from: b */
    public final String f92006b;

    public hjb(String str, String str2) {
        this.f92005a = str;
        this.f92006b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjb)) {
            return false;
        }
        hjb hjbVar = (hjb) obj;
        return wj50.m88271j(this.f92005a, hjbVar.f92005a) && wj50.m88271j(this.f92006b, hjbVar.f92006b);
    }

    public final int hashCode() {
        return this.f92006b.hashCode() + (this.f92005a.hashCode() * 31);
    }
}
