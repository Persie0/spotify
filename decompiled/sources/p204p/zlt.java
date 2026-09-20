package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zlt implements omt {

    /* JADX INFO: renamed from: a */
    public final String f284074a;

    /* JADX INFO: renamed from: b */
    public final String f284075b;

    public zlt(String str, String str2) {
        this.f284074a = str;
        this.f284075b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlt)) {
            return false;
        }
        zlt zltVar = (zlt) obj;
        return wj50.m88271j(this.f284074a, zltVar.f284074a) && wj50.m88271j(this.f284075b, zltVar.f284075b);
    }

    public final int hashCode() {
        return this.f284075b.hashCode() + (this.f284074a.hashCode() * 31);
    }
}
