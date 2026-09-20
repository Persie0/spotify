package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pjc {

    /* JADX INFO: renamed from: a */
    public final String f178222a;

    /* JADX INFO: renamed from: b */
    public final String f178223b;

    public pjc(String str, String str2) {
        this.f178222a = str;
        this.f178223b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjc)) {
            return false;
        }
        pjc pjcVar = (pjc) obj;
        return wj50.m88271j(this.f178222a, pjcVar.f178222a) && wj50.m88271j(this.f178223b, pjcVar.f178223b);
    }

    public final int hashCode() {
        return this.f178223b.hashCode() + (this.f178222a.hashCode() * 31);
    }
}
