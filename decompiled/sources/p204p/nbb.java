package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nbb {

    /* JADX INFO: renamed from: a */
    public final String f152235a;

    /* JADX INFO: renamed from: b */
    public final String f152236b;

    public nbb(String str, String str2) {
        this.f152235a = str;
        this.f152236b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbb)) {
            return false;
        }
        nbb nbbVar = (nbb) obj;
        return wj50.m88271j(this.f152235a, nbbVar.f152235a) && wj50.m88271j(this.f152236b, nbbVar.f152236b);
    }

    public final int hashCode() {
        return this.f152236b.hashCode() + (this.f152235a.hashCode() * 31);
    }
}
