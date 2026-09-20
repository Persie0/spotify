package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rle1 {

    /* JADX INFO: renamed from: a */
    public final String f200301a;

    /* JADX INFO: renamed from: b */
    public final String f200302b;

    public rle1(String str, String str2) {
        this.f200301a = str;
        this.f200302b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rle1)) {
            return false;
        }
        rle1 rle1Var = (rle1) obj;
        return wj50.m88271j(this.f200301a, rle1Var.f200301a) && wj50.m88271j(this.f200302b, rle1Var.f200302b);
    }

    public final int hashCode() {
        return this.f200302b.hashCode() + (this.f200301a.hashCode() * 31);
    }
}
