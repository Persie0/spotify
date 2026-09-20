package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class syw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f215344a;

    /* JADX INFO: renamed from: b */
    public final double f215345b;

    public syw(String str, double d) {
        this.f215344a = str;
        this.f215345b = d;
    }

    /* JADX INFO: renamed from: a */
    public final double m79716a() {
        return this.f215345b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syw)) {
            return false;
        }
        syw sywVar = (syw) obj;
        return wj50.m88271j(this.f215344a, sywVar.f215344a) && Double.compare(this.f215345b, sywVar.f215345b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f215345b) + (this.f215344a.hashCode() * 31);
    }
}
