package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ykj implements blj {

    /* JADX INFO: renamed from: a */
    public final String f273741a;

    /* JADX INFO: renamed from: b */
    public final g8m f273742b;

    /* JADX INFO: renamed from: c */
    public final rtf f273743c;

    /* JADX INFO: renamed from: d */
    public final long f273744d;

    public ykj(String str, g8m g8mVar, rtf rtfVar, long j) {
        this.f273741a = str;
        this.f273742b = g8mVar;
        this.f273743c = rtfVar;
        this.f273744d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykj)) {
            return false;
        }
        ykj ykjVar = (ykj) obj;
        if (!wj50.m88271j(this.f273741a, ykjVar.f273741a) || !wj50.m88271j(this.f273742b, ykjVar.f273742b) || !this.f273743c.equals(ykjVar.f273743c)) {
            return false;
        }
        long j = ykjVar.f273744d;
        int i = n6f.f150872l;
        return as91.m27074b(this.f273744d, j);
    }

    public final int hashCode() {
        int iHashCode = (this.f273743c.hashCode() + ((this.f273742b.hashCode() + (this.f273741a.hashCode() * 31)) * 31)) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f273744d) + iHashCode;
    }
}
