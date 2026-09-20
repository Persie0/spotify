package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cze {

    /* JADX INFO: renamed from: a */
    public final String f43539a;

    /* JADX INFO: renamed from: b */
    public final int f43540b;

    /* JADX INFO: renamed from: c */
    public final e081 f43541c;

    public cze(String str, int i, e081 e081Var) {
        this.f43539a = str;
        this.f43540b = i;
        this.f43541c = e081Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cze)) {
            return false;
        }
        cze czeVar = (cze) obj;
        return wj50.m88271j(this.f43539a, czeVar.f43539a) && this.f43540b == czeVar.f43540b && wj50.m88271j(this.f43541c, czeVar.f43541c);
    }

    public final int hashCode() {
        return this.f43541c.hashCode() + mt60.m62800g(this.f43540b, this.f43539a.hashCode() * 31, 31);
    }
}
