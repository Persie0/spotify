package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class olr {

    /* JADX INFO: renamed from: a */
    public final String f166877a;

    /* JADX INFO: renamed from: b */
    public final String f166878b;

    public olr(String str, String str2) {
        this.f166877a = str;
        this.f166878b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olr)) {
            return false;
        }
        olr olrVar = (olr) obj;
        return wj50.m88271j(this.f166877a, olrVar.f166877a) && wj50.m88271j(this.f166878b, olrVar.f166878b);
    }

    public final int hashCode() {
        return this.f166878b.hashCode() + (this.f166877a.hashCode() * 31);
    }
}
