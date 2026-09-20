package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lvb implements nvb {

    /* JADX INFO: renamed from: a */
    public final String f137267a;

    /* JADX INFO: renamed from: b */
    public final String f137268b;

    public lvb(String str, String str2) {
        this.f137267a = str;
        this.f137268b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvb)) {
            return false;
        }
        lvb lvbVar = (lvb) obj;
        return wj50.m88271j(this.f137267a, lvbVar.f137267a) && wj50.m88271j(this.f137268b, lvbVar.f137268b);
    }

    public final int hashCode() {
        return this.f137268b.hashCode() + (this.f137267a.hashCode() * 31);
    }
}
