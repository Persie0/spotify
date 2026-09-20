package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class om2 {

    /* JADX INFO: renamed from: a */
    public final dl2 f166958a;

    /* JADX INFO: renamed from: b */
    public final String f166959b;

    public om2(dl2 dl2Var, String str) {
        this.f166958a = dl2Var;
        this.f166959b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m67313a() {
        return this.f166959b;
    }

    /* JADX INFO: renamed from: b */
    public final dl2 m67314b() {
        return this.f166958a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2)) {
            return false;
        }
        om2 om2Var = (om2) obj;
        return wj50.m88271j(this.f166958a, om2Var.f166958a) && wj50.m88271j(this.f166959b, om2Var.f166959b);
    }

    public final int hashCode() {
        int iHashCode = this.f166958a.hashCode() * 31;
        String str = this.f166959b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
