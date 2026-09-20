package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class atc implements btc {

    /* JADX INFO: renamed from: a */
    public final String f19650a;

    /* JADX INFO: renamed from: b */
    public final String f19651b;

    public atc(String str, String str2) {
        this.f19650a = str;
        this.f19651b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m27129a() {
        return this.f19650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atc)) {
            return false;
        }
        atc atcVar = (atc) obj;
        return wj50.m88271j(this.f19650a, atcVar.f19650a) && wj50.m88271j(this.f19651b, atcVar.f19651b);
    }

    public final int hashCode() {
        return this.f19651b.hashCode() + (this.f19650a.hashCode() * 31);
    }
}
