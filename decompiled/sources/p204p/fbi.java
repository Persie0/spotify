package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fbi implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f67836a;

    /* JADX INFO: renamed from: b */
    public final String f67837b;

    public fbi(String str, String str2) {
        this.f67836a = str;
        this.f67837b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbi)) {
            return false;
        }
        fbi fbiVar = (fbi) obj;
        return wj50.m88271j(this.f67836a, fbiVar.f67836a) && wj50.m88271j(this.f67837b, fbiVar.f67837b);
    }

    public final int hashCode() {
        return this.f67837b.hashCode() + (this.f67836a.hashCode() * 31);
    }
}
