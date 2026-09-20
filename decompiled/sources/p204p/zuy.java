package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zuy {

    /* JADX INFO: renamed from: a */
    public final String f286565a;

    /* JADX INFO: renamed from: b */
    public final String f286566b;

    public zuy(String str, String str2) {
        this.f286565a = str;
        this.f286566b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuy)) {
            return false;
        }
        zuy zuyVar = (zuy) obj;
        return wj50.m88271j(this.f286565a, zuyVar.f286565a) && wj50.m88271j(this.f286566b, zuyVar.f286566b);
    }

    public final int hashCode() {
        return this.f286566b.hashCode() + (this.f286565a.hashCode() * 31);
    }
}
