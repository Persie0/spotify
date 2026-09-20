package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rj80 {

    /* JADX INFO: renamed from: a */
    public final String f199735a;

    /* JADX INFO: renamed from: b */
    public final String f199736b;

    public rj80(String str, String str2) {
        this.f199735a = str;
        this.f199736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj80)) {
            return false;
        }
        rj80 rj80Var = (rj80) obj;
        return wj50.m88271j(this.f199735a, rj80Var.f199735a) && wj50.m88271j(this.f199736b, rj80Var.f199736b);
    }

    public final int hashCode() {
        return this.f199736b.hashCode() + (this.f199735a.hashCode() * 31);
    }
}
