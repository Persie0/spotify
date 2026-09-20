package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tww0 implements vww0 {

    /* JADX INFO: renamed from: a */
    public final gn80 f224493a;

    /* JADX INFO: renamed from: b */
    public final String f224494b;

    public tww0(String str, gn80 gn80Var) {
        this.f224493a = gn80Var;
        this.f224494b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tww0)) {
            return false;
        }
        tww0 tww0Var = (tww0) obj;
        return this.f224493a == tww0Var.f224493a && wj50.m88271j(this.f224494b, tww0Var.f224494b);
    }

    public final int hashCode() {
        return this.f224494b.hashCode() + (this.f224493a.hashCode() * 31);
    }
}
