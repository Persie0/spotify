package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wks implements yks {

    /* JADX INFO: renamed from: a */
    public final int f252296a;

    /* JADX INFO: renamed from: b */
    public final String f252297b;

    public wks(int i, String str) {
        this.f252296a = i;
        this.f252297b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wks)) {
            return false;
        }
        wks wksVar = (wks) obj;
        return this.f252296a == wksVar.f252296a && wj50.m88271j(this.f252297b, wksVar.f252297b);
    }

    public final int hashCode() {
        return this.f252297b.hashCode() + (Integer.hashCode(this.f252296a) * 31);
    }
}
