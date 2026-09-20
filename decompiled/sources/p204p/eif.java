package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f59874a;

    /* JADX INFO: renamed from: b */
    public final String f59875b;

    public eif(int i, String str) {
        this.f59874a = i;
        this.f59875b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eif)) {
            return false;
        }
        eif eifVar = (eif) obj;
        return this.f59874a == eifVar.f59874a && wj50.m88271j(this.f59875b, eifVar.f59875b);
    }

    public final int hashCode() {
        return this.f59875b.hashCode() + s571.m77245d(Integer.hashCode(this.f59874a) * 31, 31, false);
    }
}
