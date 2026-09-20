package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class it91 {

    /* JADX INFO: renamed from: a */
    public final String f105478a;

    /* JADX INFO: renamed from: b */
    public final String f105479b;

    public it91(String str, String str2) {
        this.f105478a = str;
        this.f105479b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it91)) {
            return false;
        }
        it91 it91Var = (it91) obj;
        return wj50.m88271j(this.f105478a, it91Var.f105478a) && wj50.m88271j(this.f105479b, it91Var.f105479b);
    }

    public final int hashCode() {
        return this.f105479b.hashCode() + (this.f105478a.hashCode() * 31);
    }
}
