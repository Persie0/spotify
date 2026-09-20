package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mb1 implements nb1 {

    /* JADX INFO: renamed from: a */
    public final String f141762a;

    /* JADX INFO: renamed from: b */
    public final String f141763b;

    public mb1(String str, String str2) {
        this.f141762a = str;
        this.f141763b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb1)) {
            return false;
        }
        mb1 mb1Var = (mb1) obj;
        return wj50.m88271j(this.f141762a, mb1Var.f141762a) && wj50.m88271j(this.f141763b, mb1Var.f141763b);
    }

    public final int hashCode() {
        return this.f141763b.hashCode() + (this.f141762a.hashCode() * 31);
    }
}
