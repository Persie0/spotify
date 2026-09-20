package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rue1 {

    /* JADX INFO: renamed from: a */
    public final String f202835a;

    /* JADX INFO: renamed from: b */
    public final String f202836b;

    public rue1(String str, String str2) {
        this.f202835a = str;
        this.f202836b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rue1)) {
            return false;
        }
        rue1 rue1Var = (rue1) obj;
        return wj50.m88271j(this.f202835a, rue1Var.f202835a) && wj50.m88271j(this.f202836b, rue1Var.f202836b);
    }

    public final int hashCode() {
        return this.f202836b.hashCode() + (this.f202835a.hashCode() * 31);
    }
}
