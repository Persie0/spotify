package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fra {

    /* JADX INFO: renamed from: a */
    public final cra f72388a;

    /* JADX INFO: renamed from: b */
    public final int f72389b;

    /* JADX INFO: renamed from: c */
    public final int f72390c;

    public fra(cra craVar, int i, int i2) {
        this.f72388a = craVar;
        this.f72389b = i;
        this.f72390c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fra)) {
            return false;
        }
        fra fraVar = (fra) obj;
        return wj50.m88271j(this.f72388a, fraVar.f72388a) && this.f72389b == fraVar.f72389b && this.f72390c == fraVar.f72390c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72390c) + mt60.m62800g(this.f72389b, this.f72388a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.f72388a);
        sb.append(", indentationLevel=");
        sb.append(this.f72389b);
        sb.append(", start=");
        return edb.m38567p(sb, this.f72390c, ')');
    }
}
