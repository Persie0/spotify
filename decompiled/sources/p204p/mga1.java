package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mga1 extends oga1 {

    /* JADX INFO: renamed from: a */
    public final String f143424a;

    /* JADX INFO: renamed from: b */
    public final String f143425b;

    public mga1(String str, String str2) {
        this.f143424a = str;
        this.f143425b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m61696a() {
        return this.f143424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mga1)) {
            return false;
        }
        mga1 mga1Var = (mga1) obj;
        return wj50.m88271j(this.f143424a, mga1Var.f143424a) && wj50.m88271j(this.f143425b, mga1Var.f143425b);
    }

    public final int hashCode() {
        return this.f143425b.hashCode() + (this.f143424a.hashCode() * 31);
    }
}
