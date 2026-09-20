package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pgc {

    /* JADX INFO: renamed from: a */
    public final String f177284a;

    /* JADX INFO: renamed from: b */
    public final String f177285b;

    /* JADX INFO: renamed from: c */
    public final int f177286c;

    public pgc(String str, String str2, int i) {
        this.f177284a = str;
        this.f177285b = str2;
        this.f177286c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgc)) {
            return false;
        }
        pgc pgcVar = (pgc) obj;
        return wj50.m88271j(this.f177284a, pgcVar.f177284a) && wj50.m88271j(this.f177285b, pgcVar.f177285b) && this.f177286c == pgcVar.f177286c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177286c) + s571.m77243b(this.f177284a.hashCode() * 31, 31, this.f177285b);
    }
}
