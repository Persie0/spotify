package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uqb {

    /* JADX INFO: renamed from: a */
    public final int f232954a;

    /* JADX INFO: renamed from: b */
    public final int f232955b;

    /* JADX INFO: renamed from: c */
    public final String f232956c;

    public uqb(int i, int i2, String str) {
        this.f232954a = i;
        this.f232955b = i2;
        this.f232956c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqb)) {
            return false;
        }
        uqb uqbVar = (uqb) obj;
        return this.f232954a == uqbVar.f232954a && this.f232955b == uqbVar.f232955b && wj50.m88271j(this.f232956c, uqbVar.f232956c);
    }

    public final int hashCode() {
        return this.f232956c.hashCode() + mt60.m62800g(this.f232955b, Integer.hashCode(this.f232954a) * 31, 31);
    }
}
