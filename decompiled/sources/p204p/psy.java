package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class psy {

    /* JADX INFO: renamed from: a */
    public final gxb f181003a;

    /* JADX INFO: renamed from: b */
    public final int f181004b;

    /* JADX INFO: renamed from: c */
    public final String f181005c;

    public psy(gxb gxbVar, int i, String str) {
        this.f181003a = gxbVar;
        this.f181004b = i;
        this.f181005c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psy)) {
            return false;
        }
        psy psyVar = (psy) obj;
        return this.f181003a.equals(psyVar.f181003a) && this.f181004b == psyVar.f181004b && wj50.m88271j(this.f181005c, psyVar.f181005c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f181004b, this.f181003a.hashCode() * 31, 31);
        String str = this.f181005c;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
