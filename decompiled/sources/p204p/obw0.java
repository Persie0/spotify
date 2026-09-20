package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class obw0 implements pbw0 {

    /* JADX INFO: renamed from: a */
    public final String f163765a;

    /* JADX INFO: renamed from: b */
    public final fgr f163766b;

    /* JADX INFO: renamed from: c */
    public final boolean f163767c;

    public obw0(String str, fgr fgrVar, boolean z) {
        this.f163765a = str;
        this.f163766b = fgrVar;
        this.f163767c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obw0)) {
            return false;
        }
        obw0 obw0Var = (obw0) obj;
        return wj50.m88271j(this.f163765a, obw0Var.f163765a) && wj50.m88271j(this.f163766b, obw0Var.f163766b) && this.f163767c == obw0Var.f163767c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163767c) + ((this.f163766b.hashCode() + (this.f163765a.hashCode() * 31)) * 31);
    }
}
