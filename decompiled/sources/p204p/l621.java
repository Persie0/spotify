package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l621 {

    /* JADX INFO: renamed from: a */
    public final boolean f130146a;

    /* JADX INFO: renamed from: b */
    public final String f130147b;

    public l621(boolean z, String str) {
        this.f130146a = z;
        this.f130147b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l621)) {
            return false;
        }
        l621 l621Var = (l621) obj;
        return this.f130146a == l621Var.f130146a && wj50.m88271j(this.f130147b, l621Var.f130147b);
    }

    public final int hashCode() {
        return this.f130147b.hashCode() + (Boolean.hashCode(this.f130146a) * 31);
    }
}
